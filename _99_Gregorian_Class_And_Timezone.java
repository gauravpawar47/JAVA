package com.company;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class _99_Gregorian_Class_And_Timezone
{
    public static void main(String[] args)
    {
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(cal.isLeapYear((2000)));
        for (int i = 0; i < 10; i++)
        {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}