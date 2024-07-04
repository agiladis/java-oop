package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        // date to string
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/M/yyyy");
        String date1 = sdf1.format(new Date());
        System.out.println(date1);

        // string to date
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String dateInString = "31-08-1982 10:20:56";

        try {
            Date date2 = sdf2.parse(dateInString);
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
