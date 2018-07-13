package com.happy.config;/**
 * Created by Happy on 2018-07-09.
 */

import com.happy.interceptor.MyFilterSecurityInterceptor;
import com.happy.service.impl.UserServiceImpl;
import com.happy.util.MyPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

/**
 * 作者：微冷的雨
 *
 * @create 2018-07-09
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {  //Adapter
  /*  @Autowired
    private MyFilterSecurityInterceptor myFilterSecurityInterceptor;*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated() //任何请求,登录后可以访问
                .and().formLogin() //基于表单的登录
                .loginPage("/login") //登录页面
                .failureUrl("/login-error") //错误页面
                .permitAll() //登录和错误页面用户可以任意访问
                .and()
                .logout().permitAll(); //注销行为任意访问
        //http.addFilterBefore(myFilterSecurityInterceptor, FilterSecurityInterceptor.class);
    }

    @Bean
    //UserDetailsService 是一个接口
    //意思是@Bean明确地指示了一种方法，什么方法呢——产生一个bean的方法，并且将Bean实例交给Spring容器管理；
    //xml  <bean id="">
    //@Component  @Repostory  @Service @Controller
    UserDetailsService customUserService(){ //注册UserDetailsService 的bean
        //向Spring容器直接植入的一个Service
        return new UserServiceImpl();
    }

    //定制了一个configuration
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception { //认证管理构建器
        auth.userDetailsService(customUserService()).passwordEncoder(new MyPasswordEncoder()); //user Details Service验证
    }






}
