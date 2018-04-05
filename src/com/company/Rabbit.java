package com.company;

public class Rabbit {
    private String name;
    private int birthdayYear;

    Rabbit() {
        name = NameGenerator.setName();
        birthdayYear = TimeManager.setBirthdayYear();
    }

    @Override
    public String toString() {
        return name+" "+(TimeManager.currentYear-birthdayYear)+" years old.";
    }
}
