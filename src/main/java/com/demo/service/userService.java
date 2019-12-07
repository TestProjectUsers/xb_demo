package com.demo.service;

import com.demo.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.Map;

public interface userService extends IService<User> {
    PageInfo<User> selectUserList(Map<String,Object> params);
}
