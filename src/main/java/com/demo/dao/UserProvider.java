package com.demo.dao;

import org.springframework.util.StringUtils;

import java.util.Map;

public class UserProvider {

    public String selectUserList(Map<String,Object> params){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("select * from user u where u.is_secret = 1");
        if (params.containsKey("name")&&!StringUtils.isEmpty("name")){
            stringBuilder.append("and u.real_name like concat('%',name,'%')");
        }

        return stringBuilder.toString();
    }

}
