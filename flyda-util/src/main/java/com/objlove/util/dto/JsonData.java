package com.objlove.util.dto;

import lombok.Data;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;

@Data
@ToString
public class JsonData {

    private Boolean status;
    private String msg;
    private Object data;
    private Integer code;

    public  JsonData() {
    }

    public JsonData(Boolean status) {
        this.status = status;
    }

    public static JsonData build(Object obj, String msg, int code) {
        JsonData jsonData = new JsonData(true);
        jsonData.setCode(code);
        jsonData.setMsg(msg);
        jsonData.setData(obj);
        return jsonData;
    }

    public static JsonData build(String msg, int code) {
        JsonData jsonData = new JsonData(true);
        jsonData.setMsg(msg);
        jsonData.setCode(code);
        return jsonData;
    }

    public static JsonData build() {
        return new JsonData(true);
    }

    public static JsonData fail(String msg) {
        JsonData jsonData = new JsonData(false);
        jsonData.setMsg(msg);
        return jsonData;
    }

    public Map<String, Object> map() {
        Map<String, Object> map = new HashMap<>();
        map.put("status", status);
        map.put("msg", msg);
        map.put("data", data);
        map.put("code", code);
        return map;
    }
}
