package com.cj.one.entity.dto;

import lombok.Data;
import javax.validation.constraints.NotNull;


/**
 *
 * @Author: 陈晨
 * @Date: 2018/11/30 15:13
 */
@Data
public class EmployeeDto {
    /**
     * 员工id
     */
    @NotNull(message ="员工id不能为空")
    private Integer employeeId;
    /**
     * 用户名
     */
    @NotNull(message ="用户名不能为空")
    private String  employeeUsername;
    /**
     * 登陆密码
     */
    @NotNull(message ="密码不能为空")
    private String  employeePassword;
    /**
     * 员工姓名
     */
    @NotNull(message="姓名不能为空")
    private String  employeeName;
    /**
     * 员工性别 1男 2女
     */
    @NotNull(message ="性别不能为空")
    private Integer employeeSex;
    /**
     * 员工手机
     */
    @NotNull(message ="手机不能为空")
    private String  employeePhone;
    /**
     * 员工身份证号
     */
    @NotNull(message ="身份证号不能为空")
    private String  employeeIdCard;
    /**
     * 员工生日
     */
    @NotNull(message ="生日不能为空")
    private String  employeeBirthday;
    /**
     * 员工入职日期
     */
    @NotNull(message ="入职日期不能为空")
    private String  incompanyDay;
    /**
     * 员工通信地址
     */
    @NotNull(message ="通信地址不能为空")
    private String  employeeAddress;
    /**
     * 员工微信号
     */
    @NotNull(message ="微信号不能为空")
    private String  wechatId;
    /**
     * 紧急联系人
     */
    @NotNull(message ="紧急联系人不能为空")
    private String  emergencyContact;
    /**
     * 紧急联系人电话
     */
    @NotNull(message ="紧急联系人电话不能为空")
    private String  emergencyContactPhone;
    /**
     * 状态：0：禁用，1：启用
     */
    @NotNull(message ="状态不能为空")
    private Integer employeeStatus;

    private Integer page;
    private Integer limit;

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "employeeId=" + employeeId +
                ", employeeUsername='" + employeeUsername + '\'' +
                ", employeePassword='" + employeePassword + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSex='" + employeeSex + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeIdCard='" + employeeIdCard + '\'' +
                ", employeeBirthday='" + employeeBirthday + '\'' +
                ", incompanyDay='" + incompanyDay + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", wechatId='" + wechatId + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", emergencyContactPhone='" + emergencyContactPhone + '\'' +
                ", employeeStatus='" + employeeStatus + '\'' +
                ", page=" + page +
                ", limit=" + limit +
                '}';
    }
}
