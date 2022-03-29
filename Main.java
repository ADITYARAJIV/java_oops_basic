package com.company;

class Person{
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public char getGender(){
        return this.gender;
    }
}

class Student extends Person{

    private String school;
    private int roll_number;
    public Student (String name,int age,char gender,String school,int roll_number) {
        super(name, age, gender);
        this.school = school;
        this.roll_number = roll_number;
    }

    public String getSchool(){
        return this.school;
    }

    public int getRoll_number(){
        return this.roll_number;
    }
}

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Aditya", 22, 'M');
        System.out.println(p.getName() + " " + p.getAge() + " " + p.getGender());
        Student s = new Student("Aditya", 22, 'M', "DPS", 5);
        System.out.println(s.getSchool() + " " + s.getRoll_number());

    }
}
