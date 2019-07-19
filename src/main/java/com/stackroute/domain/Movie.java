package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.beans.factory.BeanNameAware;

//Implementing ApplicationContextAware, BeanNameAware, BeanfactoryAware
public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware{

    Actor actor;
    private ApplicationContext context;
    private BeanFactory beanFactory;

    public Movie(){}

    //Setter for Actor
    public void setActor(Actor actor) { this.actor = actor; }


    public Movie(Actor actor) {
        this.actor = actor;
    }


    //Method movie which point to Actor class display method
    public void movie()
    {
        System.out.println("In the movie");
        actor.display();
        System.out.println("Got actor details" +actor);
    }
    
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context=context;
        System.out.println("Implemented ApplicationContextAware");
    }


    @Override
    public void setBeanName(String beanName) {
        System.out.println("The name of the bean is:" +beanName);
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory= beanFactory;
        System.out.println(beanFactory);
    }

}

