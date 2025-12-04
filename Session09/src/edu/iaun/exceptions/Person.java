package edu.iaun.exceptions;

import java.io.FileNotFoundException;

public class Person {
    private String name;
    private int age;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PersonException {
        if(age < 0)
            throw new PersonException("age is negative");
        this.age = age;
    }

    public static void main(String[] args) {
        Person ali = new Person();
        try {
            ali.setAge(-20);
        }catch (PersonException e){
            System.out.println(e.getMessage());
        }
    }
}
