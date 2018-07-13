package com.happy.util;/**
 * Created by Happy on 2018-07-05.
 */

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 作者：微冷的雨
 *
 * @create 2018-07-05
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence arg0) {
        return arg0.toString();
    }

    @Override
    public boolean matches(CharSequence arg0, String arg1) {
        return arg1.equals(arg0.toString());
    }

}
