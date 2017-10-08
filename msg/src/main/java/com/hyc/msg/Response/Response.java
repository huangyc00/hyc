package com.hyc.msg.Response;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Response<T> {

    private Boolean isSuccess;

    private T data ;

    private String error ;

    public Response() {
    }

    public Response(Boolean isSuccess, T data, String error) {
        this.isSuccess = isSuccess;
        this.data = data;
        this.error = error;
    }

    public static<T>  Response ok(T t){
        return new Response(true,t ,null);
    }

    public static<T>  Response ok(String key , T t){
        Map<String , Object> model = new HashMap<String,Object>();
        model.put(key,t);
        return new Response(true,model ,null);
    }

    public static Response fail(String error){
        return new Response(false,null,error);
    }

}
