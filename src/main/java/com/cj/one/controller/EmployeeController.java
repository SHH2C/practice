package com.cj.one.controller;

import com.cj.one.common.CheckFiledUtils;
import com.cj.one.common.ResponseResult;
import com.cj.one.entity.dto.EmployeeDto;
import com.cj.one.service.EmployeeService;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Set;

/**
 * 员工Controller
 *
 * @author 陈晨
 * @Data: 2018/11/30 11:49
 */
@RestController
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;
    /**
     * 员工登录
     * @param employeeDto 用户名 密码
     * @return
     */
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST, consumes = "application/json")
    public ResponseResult toLogin(
            @Validated @RequestBody EmployeeDto employeeDto,BindingResult br,HttpSession session) {
        Set<String> onlyCheckField = new HashSet<>();
        onlyCheckField.add("employeeUsername");
        onlyCheckField.add("employeePassword");
        ResponseResult gv = new CheckFiledUtils().validateFieldVo(
                br, CheckFiledUtils.U_TYPE, null, onlyCheckField);
        if(gv!=null){
            return gv;
        }
        return employeeService.getEmployee(employeeDto,session);
    }
    /**
     * 新增员工
     * @param employeeDto
     * @return
     */
    @RequestMapping(value = "insert", method = RequestMethod.POST, consumes = "application/json")
    public ResponseResult insertEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.insertEmployee(employeeDto);
    }
    /**
     * 根据id更改员工信息
     * @param employeeDto
     * @return
     */
    @RequestMapping(value = "update", method = RequestMethod.POST, consumes = "application/json")
    public ResponseResult updateEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.updateEmployee(employeeDto);
    }
    /**
     * 退出
     * @param session
     * @return
     */
    @RequestMapping(value = "loginOut")
    public ResponseResult loginOut(HttpSession session) {
        return employeeService.loginOut(session);
    }
    /**
     * 多条件组合查询
     * @param employeeDto
     * @return
     */
    @RequestMapping(value = "selectCondition", method = RequestMethod.POST, consumes = "application/json")
    public ResponseResult getEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.listEmployee(employeeDto);
    }
}
