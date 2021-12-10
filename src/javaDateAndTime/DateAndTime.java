package javaDateAndTime;

/*
 * problem: You are given a date. You just need to write the method, which returns the day on that date.
 *
 * Link to see challenge: https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 *
 * link that contains the classes we used to solve this challenge:
 * https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/time/package-summary.html
 * */

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateAndTime {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.name();
    }
}
