package com.ainijar.service.base.impl;

import com.ainijar.domain.base.User;
import com.ainijar.mapper.base.UserMapper;
import com.ainijar.service.base.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByLoginName(String username) {
        return userMapper.getUserByLoginName(username);
    }
}
