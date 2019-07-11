package com.stackroute.domain;

public class Movie {

    //Actor Class Initialisation
    private Actor actor;

    //setter method for Actor
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //Method movie which point to Actor class display method
    public void movie()
    {
        System.out.println("In the movie");
        actor.display();
    }



}
