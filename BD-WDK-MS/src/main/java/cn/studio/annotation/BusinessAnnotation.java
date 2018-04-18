package cn.studio.annotation;/**
 * Created by Happy on 2018-04-15.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-15
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
//业务注解
public @interface BusinessAnnotation {
    //模块名字
    String moduleName();
    //操作内容
    String option();
}
