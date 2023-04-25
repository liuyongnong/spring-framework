package org.springframework.liuyn.bean;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.liuyn.configuration.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {FactoryBeanTest.class})
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
