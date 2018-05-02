package com.invoicingsystem.mapper;

/**
 * Created by FLC on 2018/4/18.
 */

import com.invoicingsystem.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * 用户Dao
 */
@Repository
public interface UserMapper {
    //登陆
    Users login(String name);

}
