package com.springframework.liuyn;

import com.springframework.liuyn.beanfactory.BeanName;
import com.springframework.liuyn.beanfactory.User;
import com.springframework.liuyn.configuration.DemoConfiguration;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class LiuynBeanFactory implements BeanPostProcessor {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(DemoConfiguration.class);
		User bean = ctx.getBean(User.class);
		BeanName beanName = ctx.getBean(BeanName.class);

		System.out.println(beanName.getUserName());
		System.out.println(bean.getAge());

	}
}
