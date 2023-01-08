package com.example.Student;

public class Student {

    private String name;
    private int age;
    private int id;
    private String standard;

    public Student(String name, int age, int id, String standard) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.standard = standard;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }
}
