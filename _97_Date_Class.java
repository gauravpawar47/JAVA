package com.company;
import java.util.*;

public class _97_Date_Class
{
    public static void main(String[] args)
    {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());

        Date d = new Date();

        System.out.println(d);
        System.out.println(d.getDate());
        System.out.println(d.getTime());
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getDay());
    }
}