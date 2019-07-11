package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        //Using ApplicationContext
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("display using ApplicationContext");


        Movie movie1 = context.getBean("movie" , Movie.class);
        movie1.movie();

        Movie movie2 = context.getBean("movie1" , Movie.class);
        movie2.movie();



    }
}
