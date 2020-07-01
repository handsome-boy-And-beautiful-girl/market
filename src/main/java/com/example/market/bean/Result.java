package com.example.market.bean;

import java.io.Serializable;

public class Result implements Serializable {
    private Integer code;
    private String msg;
    private Object data;

    public Result(){
//        super();
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result ok(String msg,Object data){
        return new Result(0,msg,data);
    }

    public Result error(String msg){
        return new Result(1,msg,null);
    }
}
