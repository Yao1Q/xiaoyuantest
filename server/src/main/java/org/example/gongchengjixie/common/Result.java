package org.example.gongchengjixie.common;

import com.alibaba.fastjson.JSONObject;

public class Result extends JSONObject {
    public static Result success(Object data){
       Result result = new Result();
       result.put("code","success");
       result.put("data",data);
       return result;
    }
    public static Result fail(Object data){
        Result result = new Result();
        result.put("code","fail");
        result.put("data",data);
        return result;
    }
    public static Result error(Object data){
        Result result = new Result();
        result.put("code","error");
        result.put("data",data);
        return result;
    }
    public static Result notLogin(Object data){
        Result result = new Result();
        result.put("code","notLogin");
        result.put("data",data);
        return result;
    }
}
