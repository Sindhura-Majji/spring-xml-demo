package com.stackroute;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        //Using ApplicationContext

        AbstractApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        context.registerShutdownHook();
      //  Movie movie1 = context.getBean("movie" , Movie.class);
       // movie1.movie();


    }
}
