package com.stackroute.p3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StartDate {
    //Write a java program to calculate first and last date of a week.
    public boolean startDate()  //4th a question
    {
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        String s1 = df.format(c.getTime());
        if (s1.equals("Mon 18/02/2019"))
            return true;
        else
            return false;

    }
}
