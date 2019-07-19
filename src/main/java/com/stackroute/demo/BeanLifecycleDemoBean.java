package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//Implementing InitializingBean , DisposableBean
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializer");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");

    }
    
//customInit method 
    public void customInit()
    {
        System.out.println("customInit bean");
    }
    
//customDestroy method
    public void customDestroy()
    {
        System.out.println("customDestroy bean");
    }
}
