package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        //Using ApplicationContext
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

        Movie movie1 = context.getBean("movie" , Movie.class);
        movie1.movie();


    }
}
