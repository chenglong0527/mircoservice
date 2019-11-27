package com.stylefeng.guns.rest;

import lombok.Data;

@Data
public class RespMessage <T>{
    T data;
    String msg;
    Integer status;
    public static RespMessage ok(){
        RespMessage<Object> message = new RespMessage<>();
        message.setStatus(200);
        message.setMsg("成功");
        return message;
    }
    public static RespMessage ok(Object data){
        RespMessage message = ok();
        message.setData(data);
        return message;
    }
    public static RespMessage fail(){
        RespMessage<Object> message = new RespMessage<>();
        message.setStatus(500);
        message.setMsg("失败");
        return message;
    }
    public static RespMessage fail(Object data){
        RespMessage message = ok();
        message.setData(data);
        return message;
    }
}
