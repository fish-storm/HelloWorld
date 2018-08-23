package com.demoone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.demoone.DAO")//将项目中对应的mapper类的路径加进来就可以了
public class DemooneApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemooneApplication.class, args);
    }
}
