package com.stackroute.domain;

public class Actor {

    //Initialising name, gender, age
    private String name;
    private String gender;
    private int age;

    //Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    //Setter method for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    //setter method for age
    public void setAge(int age) {
        this.age = age;
    }


    //Constructor for the name, gender, age
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    //Display method which display injected values
    public void display()
    {
        System.out.println("name is: " +name + " gender is: " +gender + " and age is: " +age );
    }

}
