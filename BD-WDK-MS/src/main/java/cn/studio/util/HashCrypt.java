package cn.studio.util;/**
 * Created by Happy on 2018-04-05.
 */

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;

/**
 * 作者：微冷的雨
 *
 * @create 2018-04-05
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
//Hash加密类
public class HashCrypt {
    //静态常量
    public static String MD5 = "MD5";
    //MD5密码编码器
    private final static PasswordEncoder md5 = new Md5PasswordEncoder();

    public static String getDigestHash(String str) {
            return md5.encodePassword(str,null);
    }

    public static void main(String[] args) {
        System.out.println( getDigestHash("1") );
    }
}
