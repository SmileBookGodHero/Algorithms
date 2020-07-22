package com.algorithms.fundamentals.programmingModel.demo;

/**
 * Created by lilei on 2017/9/20 上午11:00.
 */
public class Date {
    private final int month;
    private final int day;
    private final int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    private int month() {
        return month;
    }

    private int day() {
        return day;
    }

    private int year() {
        return year;
    }

    @Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Date that = (Date) obj;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }
}
