package cn.studio.util;/**
 * Created by Happy on 2018-03-30.
 */

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/**
 * 作者：微冷的雨
 *
 * @create 2018-03-30
 * 博客地址:www.cnblogs.com/weilengdeyu
 */
//使用泛型接口的人，必须用  确切的类型   进行占位符的替换
public class MyConverter implements Converter<String,Date> {
    public Date convert(String str) {
        SimpleDateFormat sdf=getDate(str);
        try {
            return sdf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
       return null;
    }

    public SimpleDateFormat getDate(String str) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        //yyyy-MM-dd
        if (Pattern.matches("^\\d{4}-\\d{1,2}-\\d{2}$",str)){
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        }
        if (Pattern.matches("^\\d{4}/\\d{1,2}/\\d{2}$",str)){
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }
        if (Pattern.matches("^\\d{4}\\d{1,2}\\d{2}$",str)){
            sdf=new SimpleDateFormat("yyyyMMdd");
        }
        return sdf;
    }
}
