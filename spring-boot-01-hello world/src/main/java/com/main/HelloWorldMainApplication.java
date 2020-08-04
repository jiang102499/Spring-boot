package com.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 标注一个主程序类，说明这是一个springboot应用（sprin boot的主配置类）
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
