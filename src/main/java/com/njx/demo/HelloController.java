package com.njx.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({User.class})
public class HelloController {
//    @Autowired
//    ConfigBean configBean;
//
//    @RequestMapping(value = "/hi")
//    public String hi(){
//        return configBean.getName();
//    }

    @Autowired
    User user;
    @RequestMapping(value = "/user")
    public String user(){
        return user.getName();
    }


}
