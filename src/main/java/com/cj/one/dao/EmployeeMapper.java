package com.cj.one.dao;

import com.cj.one.entity.dto.EmployeeDto;
import com.cj.one.entity.po.EmployeePo;
import com.cj.one.entity.vo.EmployeeVo;

import java.util.List;

/**
 * 员工dao接口
 * @author 陈晨
 */
public interface EmployeeMapper {
    /**
     * 登录功能
     * @param employeeDto 登录信息（用户名，密码）
     * @return 当前登录用户的信息
     */
    EmployeePo selectEmployee(EmployeeDto employeeDto);


    /**
     * 添加员工
     * @param employeePo 员工信息
     * //@return
     */
    int insertEmployee(EmployeePo employeePo);

    /**
     * 修改员工信息
     * @param employeePo
     * @return
     */
    int updateEmployee(EmployeePo employeePo);

    /**
     * 用于查询所有员工信息
     * @return 员工列表
     */
    List<EmployeePo> listEmployee(EmployeeDto employeeDto);

    /**
     * 通过员工id查询单个员工信息
     * @param employeeId 员工id
     * @return 员工信息
     */
    EmployeePo selectById(Integer employeeId);
}
