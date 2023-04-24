package org.springframework.liuyn.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.liuyn.configuration.Configuration;

public class FactoryBeanTest {

    @Test
    public void testFactoryBean(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Configuration.class);
        annotationConfigApplicationContext.refresh();
        Object bean = annotationConfigApplicationContext.getBean(Bean.class);
        Object bean1 = annotationConfigApplicationContext.getBean("bean");
        if (bean instanceof FactoryBeanName) {
        }else if (bean instanceof Bean) {
        }

        System.out.println(bean1.getClass().getName());
    }
}
