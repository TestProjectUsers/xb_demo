package com.demo.dao;

import com.demo.entity.User;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface UserMapper extends Mapper<User> {

    @SelectProvider(type = UserProvider.class,method = "selectUserList")
    List<User> selectUserList(Map<String,Object> params);
}