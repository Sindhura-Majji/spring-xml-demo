package com.stackroute.domain;

public class Movie {

    Actor actor;

    public Movie(){}


    //Setter for Actor class
    public void setActor(Actor actor) { this.actor = actor; }

    //Movie constructor
    public Movie(Actor actor) {
        this.actor = actor;
    }


    //Method movie which point to Actor class display method
    public void movie()
    {
        System.out.println("In the movie");
        actor.display();
    }


}
