package org.springframework.liuyn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.liuyn.bean.UserDao;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void changeUser(){
        userDao.setUserName("Tom");
        userDao.setWork("python");
        userDao.setAge(10);
    }
}
