package com.bradmcdermott.borisordavid;
import org.joda.time.LocalDateTime;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Created by bradleymcdermott on 10/12/15.
 */
public class BorisOrDavidTest
{

    @Test
    public void testIsDavid() throws Exception
    {
        assertTrue("First day is david",
                   BorisOrDavid.isDavid(new LocalDateTime(2014, 12, 29, 0, 0)));
        assertFalse(
                "First boris day is jan 5th",
                BorisOrDavid.isDavid(new LocalDateTime(2015, 1, 5, 0, 0)));
        assertTrue(
                "5 min before change is still david",
                BorisOrDavid.isDavid(new LocalDateTime(2015, 1, 4, 23, 55)));
        assertTrue(
                "First david week for 2016",
                BorisOrDavid.isDavid(new LocalDateTime(2016, 1, 11, 0, 0)));
    }
}