package com.happy.util;/**
 * Created by Happy on 2018-07-03.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 作者：微冷的雨
 *
 * @create 2018-07-03
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
/*@EnableWebSecurity*/
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/css/**","/js/**","/fonts/**", "/index").permitAll() //都可以访问
                .antMatchers("/users/**").hasRole("ADMIN") //需要相应的角色才能访问
                .and()
                .formLogin() //基于Form表单登录验证
                .loginPage("/login") //自定义登录信息
               .failureUrl("/login-error");
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication() //认证信息存储在内存中
                .passwordEncoder(new MyPasswordEncoder())//在此处应用自定义PasswordEncoder
                .withUser("happy").password("6375196").roles("ADMIN");
    }

}
