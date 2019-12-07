package com.demo.service.Impl;

import com.demo.dao.UserMapper;
import com.demo.dao.UserProvider;
import com.demo.entity.User;
import com.demo.service.userService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

@Service
@Transactional

public class userServiceImpl extends IServiceImpl<User> implements userService {


    @Override
    public PageInfo<User> selectUserList(Map<String, Object> params) {
        if (StringUtils.isEmpty(params.get("pageNum"))){
            params.put("pageNum",1);
        }
        if (StringUtils.isEmpty(params.get("pageSize"))){
            params.put("pageSize",5);
        }
        PageHelper.startPage((Integer) params.get("pageNum"),(Integer) params.get("pageSize"));
        UserMapper UserMapper = (UserMapper) mapper;
        List<User> users = ((UserMapper) mapper).selectUserList(params);
        PageInfo<User> userPageInfo = new PageInfo<>(users);
        return userPageInfo;
    }
}
