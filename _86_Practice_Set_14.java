package com.company;
import java.util.Scanner;

public class _86_Practice_Set_14
{
    public static void main(String[] args)
    {
        // Question 1 : Write a Java program to demonstrate syntax , logical & runtime error
        
        // Syntax Error - int age = 7

        // Logical Error -
        // int age = 78;
        // int year_born = 2000-78;

        // Runtime Error -
        // System.out.println(6/0);

        // Question 2 : Write a Java program that prints "Haha" during Arithmetic exception and "HeHe" during an Illegal argument exception

        try
        {
            int a = 666 / 0;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("HeHe");
        }
        catch(ArithmeticException e)
        {
            System.out.println("HaHa");
        }
        System.out.println();

        // Question 3: Write a Program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "Error"

        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        
        Scanner sc= new Scanner(System.in);
        int index;
        int i = 0;

        while(flag && i < 5)
        {
            try
            {
                System.out.print("Enter the value of index : ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is : "+ marks[index]);
                break;
            }
            catch(Exception e)
            {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i >= 5)
        {
            System.out.println("Error");
        }

        // Question 4 : Modify program in Question 3 to throw a custom Exception if max retires are reached

//        if(i>=5)
//        {
//            System.out.println("Error");
//            try
//            {
//                throw new MaxRetriesException();
//            }
//            catch(Exception e)
//            {
//                System.out.println("Exception:"+e);
//            }
//        }

        // Question 5

    }
}