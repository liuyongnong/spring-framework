package org.springframework.liuyn.bean;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class Bean implements FactoryBean<FactoryBeanName> {


    @Override
    public FactoryBeanName getObject() throws Exception {
        return new FactoryBeanName();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
