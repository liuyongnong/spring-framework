package org.springframework.liuyn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.liuyn.bean.UserDao;

@org.springframework.context.annotation.Configuration
@ComponentScan(value = "org.springframework.liuyn.*")
@Order(value = 1)
public class Configuration {

    @Bean
    public UserDao getUserDao(){
        return new UserDao();
    }
}
