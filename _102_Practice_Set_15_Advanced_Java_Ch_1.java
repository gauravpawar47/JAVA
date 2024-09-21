package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.*;

public class _102_Practice_Set_15_Advanced_Java_Ch_1
{
    public static void main(String[] args)
    {
        // Question 1 : Create an ArrayList and store names of 10 students inside it . Print it using For each Loop

        ArrayList ar = new ArrayList();
        String []str = new String[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++)
        {
            System.out.print("Enter student "+ i +" name : ");
            str[i] = input.next();
            ar.add(str[i]);
        }

        System.out.println();
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Student "+ i + " Name : "+ ar.get(i));
        }
        System.out.println();

        // Question 2 : Used the Date class in Java to Print time in the following format : HH:MM:SS

        Date d = new Date();
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        System.out.println();
        
        // Question 3 : Repeat Question 2 using the Calendar class

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.println();

        // Question 4 : Repeat Question 2 using the java.time API

        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);
        System.out.println();

        // Question 5 : Create a set in Java . Try to store duplicate elements inside this set and verify that only one instance is stored

        HashSet <Integer> s = new HashSet<>();

        int []arr = new int[6];

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter digit for "+ i + " : ");
            arr[i] = input.nextInt();
            s.add(arr[i]);
        }

        System.out.println("Digits : "+ s);
        System.out.println();
    }
}