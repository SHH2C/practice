package com.cj.one.entity.po;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: 陈晨
 * @Date: 2018/11/30 15:07
 */
@Getter
@Setter
public class EmployeePo {
    /**
     * 员工id
     */
    private Integer employeeId;
    /**
     * 员工姓名
     */
    private String  employeeName;
    /**
     * 员工性别1:男2：女
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
     * 创建时间
     */
    private String  createdAt;
    /**
     * 更新时间
     */
    private String  updatedAt;
    /**
     * 用户名
     */
    private String  employeeUsername;
    /**
     * 登陆密码
     */
    private String  employeePassword;
    /**
     * 操作权限:0:初级 1：中级 2：高级
     */
    private Integer employeeRank;
    /**
     * 状态：0：禁用，1：启用
     */
    private Integer employeeStatus;

    @Override
    public String toString() {
        return "EmployeePo{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSex=" + employeeSex +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeIdCard='" + employeeIdCard + '\'' +
                ", employeeBirthday='" + employeeBirthday + '\'' +
                ", incompanyDay='" + incompanyDay + '\'' +
                ", employeeAddress='" + employeeAddress + '\'' +
                ", wechatId='" + wechatId + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", emergencyContactPhone='" + emergencyContactPhone + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", employeeUsername='" + employeeUsername + '\'' +
                ", employeePassword='" + employeePassword + '\'' +
                ", employeeRank=" + employeeRank +
                ", employeeStatus=" + employeeStatus +
                '}';
    }
}
