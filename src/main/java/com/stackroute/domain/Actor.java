package com.stackroute.domain;

public class Actor {

    //Initialising name, gender,age
    private String name;
    private String gender;
    private int age;

    //Setter methods for name,gender,age
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Display method which display injected values
    public void display()
    {
        System.out.println("name is: " +name + " gender is: " +gender + " and age is: " +age );
    }

}
