package com.invoicingsystem.util;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;

@Configuration
public class MyBatisConfiguration {
	@Bean
	public PageHelper pageHelper()
	{
		PageHelper pagehelper=new PageHelper();
		Properties properties=new Properties();
		properties.setProperty("offsetAsPageNum", "true");
		properties.setProperty("rowBoundsWithCount", "true");
		properties.setProperty("reasonable", "true");
		properties.setProperty("returnPageInfo", "check");
		properties.setProperty("params", "count=countSql");
		pagehelper.setProperties(properties);
		return pagehelper;
	}
}
