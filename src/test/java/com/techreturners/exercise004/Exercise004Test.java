package com.techreturners.exercise004;

import org.junit.Test;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 3, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test(expected = DateTimeException.class)
    public void checkGetDateTimeWhenInvalidDateIsEntered() {
        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 90));
    }

    @Test
    public void checkGetDateTimeWhenDataTimeIsLeapYear() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2020, Month.FEBRUARY, 29, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2051, Month.NOVEMBER, 8, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

}
