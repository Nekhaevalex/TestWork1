package com.company;

public class TimeManager {
    public static int currentYear;
    public static int setBirthdayYear() {
        return currentYear;
    }
    TimeManager() {
        currentYear = 1;
    }
    public void newYear() {
        currentYear++;
    }
}
