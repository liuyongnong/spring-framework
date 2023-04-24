package org.springframework.liuyn.annonation;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.liuyn.bean.UserDao;
import org.springframework.liuyn.configuration.Configuration;
import org.springframework.liuyn.configuration.ConfigurationDemo;
import org.springframework.liuyn.service.UserService;

public class ConfigurationTest {

    @Test
    public void testConfiguration(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ConfigurationDemo.class);
        applicationContext.register(Configuration.class);
        applicationContext.refresh();
        UserService userService = applicationContext.getBean(UserService.class);
        UserDao user = applicationContext.getBean(UserDao.class);
        System.out.println(user);
        userService.changeUser();
        System.out.println(user);
    }



}
