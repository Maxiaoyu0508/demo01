package com.njx.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@Configuration
//@PropertySource(value = "classpath:application.properties")
//@ConfigurationProperties(prefix = "com.njx")
public class DemoApplication {

//    private String name;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
//    @RequestMapping(value = "/hello")
//    public String hi(){
//        return name;
//    }

}
