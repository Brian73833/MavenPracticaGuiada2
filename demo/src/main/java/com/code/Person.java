package com.code;

public class Person {
    private String name;
    private int age;
    private boolean isStudent;
    private int id;

    public Person() {

    }

    public Person(String name, int age, boolean isStudent, int id) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean isStudent) {
        this.isStudent = isStudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " IsStudent: " + isStudent + " Id: " + id;
    }

}
