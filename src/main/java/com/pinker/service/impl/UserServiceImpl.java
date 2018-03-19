package com.pinker.service.impl;

import com.pinker.entity.User;
import com.pinker.mapper.UserMapper;
import com.pinker.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User login(User user) {

        return userMapper.findUser(user);

    }
}
