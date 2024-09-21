package com.company;
import java.util.Scanner;

public class _19_Practice_Set_4
{
    public static void main(String[] args)
    {
        // Question 1 : What will be the following output of the program. (--> This will throw an error because we are assigned the value in the if statement which is wrong .. we cannot assigned the value in the if statement we can campare the value or check the value in the if statement.

        // int a = 10;

        // if (a = 11)
        // {
        //     System.out.println("I'm 11");
        // }
        // else
        // {
        //     System.out.println("I'm not 11");
        // }

        // Question 2 : Write a program to find out whether a student is pass or fail ; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input form the user

        byte m1;
        byte m2;
        byte m3;

        Scanner input = new Scanner (System.in);

        System.out.println();
        System.out.print("Enter the Marks of sub1 : ");
        m1 = input.nextByte();

        System.out.print("Enter the Marks of sub2 : ");
        m2 = input.nextByte();

        System.out.print("Enter the Marks of sub3 : ");
        m3 = input.nextByte();

        float avg = (m1+ m2 + m3) / 3;

        System.out.println();
        System.out.println("Your Total percentage is : "+ avg);

        if(avg >= 40 && m1 > 34 && m2 > 34 && m3 > 34)
        {
            System.out.println("You have been promoted");
        }
        else
        {
            System.out.println("You have been Not promoted");
        }

        // Question 3 : Calculate income tax paid by an employee to the government as per the slabs mentioned below

       // Income Slab     Tax
       // 2.5L - 5.0L     5%
       // 5.0L - 10.0L    20%
       // Above 10.L      30%

        float income;
        float tax = 0;

        System.out.println();
        System.out.print("Enter your Income in LPA : ");
        income = input.nextFloat();

        if(income <= 2.5f)
        {
            tax = tax + 0;
        }
        else if(income > 2.5f && income <= 5.0f)
        {
            tax = tax + 0.05f * (income - 2.5f);

        }
        else if(income > 5.0f && income <= 10.0f )
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 2.5f);
        }
        else if(income > 10.0f)
        {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by Employee is : "+ tax);

        // Question 4 : Write a Java Program to find out the day of a week given the number [1 For Monday , 2 For Tuesday .. and so on ..!]

        byte day;

        System.out.println();
        System.out.print("Enter the number of day to show the name of the day : ");
        day = input.nextByte();

        switch (day)
        {
            case 1 -> System.out.println("This is Monday");
            case 2 -> System.out.println("This is Tuesday");
            case 3 -> System.out.println("This is Wednesday");
            case 4 -> System.out.println("This is Thursday");
            case 5 -> System.out.println("This is Friday");
            case 6 -> System.out.println("This is Saturday");
            case 7 -> System.out.println("This is Sunday");
            default -> System.out.println("Invalid Input");
        }

        // Question 5 : Write a Java Program to find whether a year entered by the user is a leap year or not

        int leapYear;

        System.out.println();
        System.out.print("Enter the year to check it is leap or not : ");
        leapYear = input.nextInt();

        if (((leapYear % 4 == 0) && (leapYear % 100!= 0)))
        {
            System.out.println(leapYear +" is the Leap year");
        }
        else
        {
            System.out.println(leapYear +" is not the Leap year");
        }

        // Question 6 : Write a Program to find out the type of website from the URL

        // 1) .com = commercial website
        // 2) .org = orgnaizational website
        // 3) .in = indian website

        System.out.println();
        System.out.print("Enter the name of your website : ");
        String web = input.next();

        if(web.endsWith(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if(web.endsWith(".org"))
        {
            System.out.println("Orgnizational Website");
        }
        else if(web.endsWith(".in"))
        {
            System.out.println("Indian Website");
        }
    }
}