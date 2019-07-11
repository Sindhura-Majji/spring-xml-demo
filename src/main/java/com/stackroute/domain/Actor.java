package com.stackroute.domain;

public class Actor {

    //Initialising name, gender, age
    private String name;
    private String gender;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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
