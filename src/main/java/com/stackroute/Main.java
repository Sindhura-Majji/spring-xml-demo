package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

    public static void main(String[] args) {

        //Using ApplicationContext
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("display using ApplicationContext");

//Calling movie method through movie beans
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.movie();

        Movie movie4 = context.getBean("movie4", Movie.class);
        movie4.movie();

        Movie movie2 = context.getBean("movie2", Movie.class);
        movie2.movie();

        Movie movie3 = context.getBean("movie2", Movie.class);
        movie3.movie();

        System.out.println(movie2==movie3);


    }
}
