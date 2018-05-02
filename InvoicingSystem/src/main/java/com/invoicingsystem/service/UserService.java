package com.invoicingsystem.service;

import com.invoicingsystem.entity.Users;

/**
 * Created by FLC on 2018/4/18.
 */

public interface UserService {
    Users login(String name);
}
