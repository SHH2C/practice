package com.cj.one.entity.vo;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: 陈晨
 * @Date: 2018/11/30 15:13
 */
@Data
public class EmployeeVo {
    /**
     * 员工id
     */

    private Integer employeeId;
    /**
     * 员工姓名
     */
    @NotNull(message="姓名不能为空")
    private String  employeeName;
    /**
     * 员工性别 男 女
     */
    private Integer employeeSex;
    /**
     * 员工手机
     */
    private String  employeePhone;
    /**
     * 员工身份证号
     */
    private String  employeeIdCard;
    /**
     * 员工生日
     */
    private String  employeeBirthday;
    /**
     * 员工入职日期
     */
    private String  incompanyDay;
    /**
     * 员工通信地址
     */
    private String  employeeAddress;
    /**
     * 员工微信号
     */
    private String  wechatId;
    /**
     * 紧急联系人
     */
    private String  emergencyContact;
    /**
     * 紧急联系人电话
     */
    private String  emergencyContactPhone;
    /**
     * 状态：0：禁用，1：启用
     */
    private Integer employeeStatus;

    /**
     * 操作权限:0初级 1中级 2高级
     */
    private Integer employeeRank;
}
