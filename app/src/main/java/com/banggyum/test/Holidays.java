package com.banggyum.test;

public class Holidays implements Comparable<Holidays>{

    private String day_month; // 년월일
    private String year; // 연도
    private String date; // 월일
    private String name; // 휴일 명칭

    public Holidays() {
    }

    public Holidays(String day_month, String year, String date, String name) {
        this.day_month = day_month;
        this.year = year;
        this.date = date;
        this.name = name;
    }

    public String getDay_month() {
        day_month = year + date;
        return day_month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Holidays h) {
        return this.date.compareTo(h.date);
    }
}



