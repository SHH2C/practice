package com.cj.one.service.impl;

import com.cj.one.common.PageHelp;
import com.cj.one.common.ResponseResult;
import com.cj.one.dao.EmployeeMapper;
import com.cj.one.entity.dto.EmployeeDto;
import com.cj.one.entity.po.EmployeePo;
import com.cj.one.entity.vo.EmployeeVo;
import com.cj.one.enu.UserErrorEnum;
import com.cj.one.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 员工类业务接口实现类
 * @author 陈晨
 */
@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {


    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public ResponseResult getEmployee(EmployeeDto employeeDto,HttpSession session) {

        EmployeePo employeePo = employeeMapper.selectEmployee(employeeDto);
        if(employeePo!=null){
            if(BCrypt.checkpw(employeeDto.getEmployeePassword(),employeePo.getEmployeePassword())){
                EmployeeVo employeeVo=new EmployeeVo();
                BeanUtils.copyProperties(employeePo ,employeeVo);
                session.setAttribute("employee","employeeVo");
                return new ResponseResult(UserErrorEnum.QUERY_USER_SUCC.getCode(),UserErrorEnum.QUERY_USER_SUCC.getMsg(),employeeVo);
            }
        }
        return new ResponseResult(UserErrorEnum.QUERY_USER_FAIL.getCode(),UserErrorEnum.QUERY_USER_FAIL.getMsg(),null);

    }

    @Override
    public ResponseResult insertEmployee(EmployeeDto employeeDto) {
        EmployeePo employeePo=new EmployeePo();
        employeeDto.setEmployeePassword(BCrypt.hashpw(employeeDto.getEmployeePassword(), BCrypt.gensalt()));
        BeanUtils.copyProperties(employeeDto,employeePo);
        int result=employeeMapper.insertEmployee(employeePo);
        if(result>0){
            return new ResponseResult(UserErrorEnum.ADD_USER_SUCC.getCode(),UserErrorEnum.ADD_USER_SUCC.getMsg(),null);
        }else{
            return new ResponseResult(UserErrorEnum.ADD_USER_FAIL.getCode(),UserErrorEnum.ADD_USER_FAIL.getMsg(),null);
        }
    }

    @Override
    public ResponseResult updateEmployee(EmployeeDto employeeDto) {
        EmployeePo employeePo=new EmployeePo();
        BeanUtils.copyProperties(employeeDto,employeePo);
        int result =employeeMapper.updateEmployee(employeePo);
        if(result>0){
            return new ResponseResult(UserErrorEnum.UPDATE_USER_SUCC.getCode(),UserErrorEnum.UPDATE_USER_SUCC.getMsg(),null);
        }else{
            return new ResponseResult(UserErrorEnum.UPDATE_USER_FAIL.getCode(),UserErrorEnum.UPDATE_USER_FAIL.getMsg(),null);
        }
    }

    @Override
    public ResponseResult listEmployee(EmployeeDto employeeDto) {
        EmployeeVo employeeVo =null;
        List<EmployeeVo> employeeVoList=new ArrayList<EmployeeVo>();
        PageHelp pageHelp=new PageHelp();
        pageHelp.init(employeeDto.getPage(),employeeDto.getLimit());
        List<EmployeePo> employeePoList=employeeMapper.listEmployee(employeeDto);
        Iterator<EmployeePo> iterator = employeePoList.iterator();
        while(iterator.hasNext()){
            employeeVo =new EmployeeVo();
            BeanUtils.copyProperties(iterator.next(),employeeVo);
            employeeVoList.add(employeeVo);
        }
        if(employeeVoList.size()==0){
            return new ResponseResult(UserErrorEnum.QUERY_USER_FAIL.getCode(),UserErrorEnum.QUERY_USER_FAIL.getMsg(),null);
        }
        PageInfo<EmployeeVo> pageInfo = new PageInfo<EmployeeVo>(employeeVoList);
        return new ResponseResult(UserErrorEnum.QUERY_USER_SUCC.getCode(),UserErrorEnum.QUERY_USER_SUCC.getMsg(),pageInfo);
    }

    @Override
    public ResponseResult loginOut(HttpSession session) {
        try{
            session.removeAttribute("employee");
        }catch (Exception e){
            return new ResponseResult(UserErrorEnum.QUERY_USER_SUCC.getCode(),UserErrorEnum.QUERY_USER_SUCC.getMsg(),null);
        }
        return new ResponseResult(UserErrorEnum.QUERY_USER_FAIL.getCode(),UserErrorEnum.QUERY_USER_FAIL.getMsg(),null);

    }
}
