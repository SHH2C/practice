package com.cj.one.common;

import com.cj.one.enu.UserErrorEnum;
import lombok.Data;

import java.util.List;

/**
 * 给前端返回数据格式
 * @Author: 陈晨
 * @Date: 2018/11/30 15:35
 */
@Data
public class ResponseResult<T> {
        private int code;
        private String msg;
        private T data;

        public ResponseResult() {
        }
        /**
         * @param code	返回码数组
         * @param msg	错误信息数组
         * @param data	返回正文内容
         */
        public ResponseResult(int code, String msg, T data) {
            this.setCode(code);
            this.setMsg(msg);
            this.setData(data);
        }
        /**
         * 构造方法
         * @param errorEnum
         * @param data
         */
        public ResponseResult(UserErrorEnum errorEnum, T data) {
            this.setCode(errorEnum.getCode());
            this.setMsg(errorEnum.getMsg());
            this.setData(data);
        }
        public T getData() {
            return data;
        }

        public void setData(T t) {
            this.data = t;
        }
        @Override
        public String toString() {
            String result = new StringBuilder()
                    .append('{')
                    .append("\"code\":").append(this.getCode()).append(',')
                    .append("\"msg\":\"").append(this.getMsg()).append("\",")
                    .append("\"data\":").append(this.getData())
                    .append('}')
                    .toString();
            return result;
        }
}
