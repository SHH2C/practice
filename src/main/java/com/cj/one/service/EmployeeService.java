package com.cj.one.service;
import com.cj.one.common.ResponseResult;
import com.cj.one.entity.dto.EmployeeDto;
import com.cj.one.entity.vo.EmployeeVo;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 员工类业务接口
 * @author 陈晨
 */
public interface EmployeeService {
    /**
     * 登录方法
     * @param employeeDto
     * @return
     */
    ResponseResult getEmployee(EmployeeDto employeeDto,HttpSession session);

    /**
     * 添加新员工
     * @param employeeDto 员工信息
     * @return
     */
    ResponseResult insertEmployee(EmployeeDto employeeDto);

    /**
     * 更改员工信息
     * @param employeeDto 员工信息
     * @return
     */
    ResponseResult updateEmployee(EmployeeDto employeeDto);

    /**
     * 多条件组合模糊查询（分页）
     * @param employeeDto
     * @return

    List<EmployeeVo> listEmployee(EmployeeDto employeeDto);
     */

    ResponseResult listEmployee(EmployeeDto employeeDto);
    /**
     * 登出系统
     * @param session
     * @return
     */
    ResponseResult loginOut(HttpSession session);

}
