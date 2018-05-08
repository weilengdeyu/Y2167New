package cn.happy;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Properties;

@SpringBootApplication
@MapperScan("cn.happy.*")
@EnableTransactionManagement
public class NewsApplication {
	public static void main(String[] args) {
		SpringApplication.run(NewsApplication.class, args);
	}
}
