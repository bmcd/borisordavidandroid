package com.bradmcdermott.borisordavid;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.Weeks;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by bradleymcdermott on 10/12/15.
 */
public class BorisOrDavid
{
    public static final LocalDateTime START_DATE = new LocalDateTime(2014, 12, 29, 0, 0);

    public static final int DAVID = 0;

    public static boolean isDavid(LocalDateTime date)
    {
        Weeks weeksBetween = Weeks.weeksBetween(START_DATE, date);

        return weeksBetween.getWeeks() % 2 == DAVID;
    }
}
