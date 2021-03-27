package com.streamliners.task0.string;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimeString {
    public static void main(String[] args) {
        //format y-m-d
        String string = "2021-09-24";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        System.out.println(date);
    }
}
