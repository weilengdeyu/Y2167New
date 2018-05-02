package com.invoicingsystem.service.impl;


import com.invoicingsystem.mapper.UserMapper;
import com.invoicingsystem.entity.Users;
import com.invoicingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by FLC on 2018/4/18.
 */

@Service("userServices")
@Transactional(readOnly=true,rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Users login(String name) {
        return userMapper.login(name);
    }
}
