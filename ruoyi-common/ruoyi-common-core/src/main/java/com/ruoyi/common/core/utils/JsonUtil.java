package com.ruoyi.common.core.utils;

import com.alibaba.fastjson.JSON;

public class JsonUtil {
    public static   String obj2Str(Object obj){
        return JSON.toJSONString(obj);
    }

    public static Object Str2Obj(String msg,Class clazz) {
        Object  obj = JSON.parseObject(msg, clazz);
        return  obj;

    }
}
