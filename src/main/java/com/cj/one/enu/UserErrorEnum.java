package com.cj.one.enu;

/**
 * @Author: 陈晨
 * @Date: 2018/12/10 16:41
 */
public enum UserErrorEnum {


    /**
     * 用户操作枚举
     */
    /*****************************     新增用户    *******************************/
    ADD_USER_SUCC(20001, "新增用户成功", "add USER success", "操作成功"),
    ADD_USER_FAIL(20002, "新增用户失败", "add USER fail", "操作失败"),
    ADD_USER_EXCE(20003, "新增用户异常", "add USER exception", "操作异常"),

    /*****************************     删除用户    *******************************/
    DELETE_USER_SUCC(20004, "删除用户成功", "delete USER success", "操作成功"),
    DELETE_USER_FAIL(20005, "删除用户失败", "delete USER fail", "操作失败"),
    DELETE_USER_EXCE(20006, "删除用户异常", "delete USER exception", "操作异常"),

    /*****************************     修改用户    *******************************/
    UPDATE_USER_SUCC(20007, "修改用户成功", "update USER success", "操作成功"),
    UPDATE_USER_FAIL(20008, "修改用户失败", "update USER fail", "操作失败"),
    UPDATE_USER_EXCE(20009, "修改用户异常", "update USER exception", "操作异常"),

    /*****************************     查询用户    *******************************/
    QUERY_USER_SUCC(20010, "查询用户成功", "query USER success", "操作成功"),
    QUERY_USER_FAIL(20011, "查询用户失败", "query USER fail", "操作失败"),
    QUERY_USER_EXCE(20013, "查询用户异常", "query USER exception", "操作异常"),


    /*****************************     修改密码    *******************************/
    UPDATE_PASSWORD_SUCC(20014, "修改密码成功", "update USER success", "操作成功"),
    UPDATE_PASSWORD_FAIL(20015, "修改密码失败", "update USER fail", "操作失败"),
    UPDATE_PASSWORD_EXCE(20016, "修改密码异常", "update USER exception", "操作异常"),
    CHECK_EMPLOYEE_STATUS_FAIL(20017, "员工未启用！", "The employee was not enabled", "操作失败"),
    CHECK_ROLE_STATUS_FAIL(20018, "角色\"%s\"未启用", "The role was not enabled", "操作失败"),
    CHECK_DATA(20000,"必要字段不能为空","check fail","失败");
    private int code;

    private String msg;

    private String subCode;

    private String subMsg;

    UserErrorEnum(int code, String msg, String subCode, String subMsg) {
        this.code = code;
        this.msg = msg;
        this.subCode = subCode;
        this.subMsg = subMsg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }
}
