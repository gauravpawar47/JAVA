package com.company;
import java.util.*;

public class _98_Calender_Class
{
    public static void main(String[] args)
    {
        Calendar c = Calendar.getInstance();

        System.out.println(c.getCalendarType());
        System.out.println("Current Year   : "+ c.get(Calendar.YEAR));
        System.out.println("Current Month  : "+ c.get(Calendar.MONTH));
        System.out.println("Current Day    : "+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current Hour   : "+ c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current Minute : "+ c.get(Calendar.MINUTE));
        System.out.println("Current Second : "+ c.get(Calendar.SECOND));
    }
}