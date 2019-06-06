package com.njx.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.yml")//application-dev.properties
@ConfigurationProperties(prefix = "com.njx")
public class User {
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
