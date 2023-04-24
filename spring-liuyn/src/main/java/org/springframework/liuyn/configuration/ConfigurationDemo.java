package org.springframework.liuyn.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.liuyn.bean.Branch;

@Configuration
@Order(value = 0 )
public class ConfigurationDemo {
    @Bean
    public Branch getBranch(){
        return new Branch();
    }
}
