package com.company;

public class Date {
    private int year;
    private int month;
    private int day;

    Date() {
        this.year = 12;
        this.month = 2012;
        this.day = 12;
    }

    Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }
}
