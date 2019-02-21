package com.stackroute.p3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EndDate
{

    public boolean endDate()// 4th b question
    {
        Calendar c = Calendar.getInstance();
        String s2 = "";
// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

// Print dates of the current week starting on Monday
        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        for (int i = 0; i < 6; i++) {
            c.add(Calendar.DATE, 1);
        }
        s2 = (df.format(c.getTime()));
        if (s2.equals("Sun 24/02/2019"))
            return true;
        else
            return false;

    }
}
