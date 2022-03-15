package com.techreturners.exercise002;
//Person p1 = new Person("Peter", "Smith", "Manchester", 23);
//Person p2 = new Person("Susan", "Farmer", "Leeds", 23);
public class Person {
    private String firstname;
    private String lastname;
    private String city;
    private int age;

    public Person(String firstname,String lastname,String city,int age){
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.age = age;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public String getCity(){
        return city;
    }

    public int getAge() {
        return age;
    }
}
