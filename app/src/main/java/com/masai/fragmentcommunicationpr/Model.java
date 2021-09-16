package com.masai.fragmentcommunicationpr;

import java.io.Serializable;

public class Model implements Serializable {
    private String name;
    private int age;
    private String Grade;
    private String Percentage;

    public Model(String name, int age, String grade, String percentage) {
        this.name = name;
        this.age = age;
        Grade = grade;
        Percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return Grade;
    }

    public String getPercentage() {
        return Percentage;
    }
}
