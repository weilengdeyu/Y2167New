package cn.happy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("cn.happy.*")
@EnableTransactionManagement
public class ExamApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}
}
