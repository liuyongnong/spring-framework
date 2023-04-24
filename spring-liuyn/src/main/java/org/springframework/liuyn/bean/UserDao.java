package org.springframework.liuyn.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class UserDao {

    @Value("testName")
    private String userName;

    @Value("java")
    private String work;

    @Value("10")
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "userName='" + userName + '\'' +
                ", work='" + work + '\'' +
                ", age=" + age +
                '}';
    }
}
