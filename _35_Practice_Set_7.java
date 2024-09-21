package com.company;
import java.util.Scanner;

public class _35_Practice_Set_7
{
    static void Multiplication_1(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d X %d = %d\n", n , i , n * i);
        }
        System.out.println();
    }

    static void Pattern_2(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int sum_rec_3(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n + sum_rec_3(n - 1);
        }
    }

    static void pattern_4(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = n; j >= i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib_rec_5(int n)
    {
        if(n == 1 || n == 2)
        {
            return n - 1;
        }
        else
        {
            return fib_rec_5(n - 1) + fib_rec_5(n - 2);
        }
    }

    static int average_6(int []arr)
    {
        return 0;
    }

    static void pattern_8(int n)
    {
        if(n > 0)
        {
            pattern_8(n - 1);
            for (int i = n; i >= 1; i--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static float convert_9(float n)
    {
        float a = 1.8f;
        float far = (a * n) + 32.00f;

        return far;
    }

    static int sum_iter_10(int n)
    {
        return (n * n + n) / 2;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);

        // Question 1 : Write a Java Method to print multiplication table of a number n

        //        int n;
        //
        //        System.out.print("Enter the number that you want the multiplication table of : ");
        //        n = input.nextInt();
        //
        //        Multiplication_1(n);


        // Question 2 : Write a Program using functions to print the following pattern :

        //        *
        //        * *
        //        * * *
        //        * * * *
        //
        //        Pattern_2(4);


        // Question 3 : Write a recursive function to calculate sum of first n natural numbers

        //        int n2;
        //
        //        System.out.print("Enter the digit you want to sum upto : ");
        //        n2 = input.nextInt();
        //
        //        System.out.println("The sum of first "+ n2 +" natural numbers are : "+ sum_rec_3(n2));

        // Question 4 : Write a Function to print the following pattern

        //        * * * *
        //        * * *
        //        * *
        //        *

        //        pattern_4(4);

        // Question 5 : Write a function to print nth term of fibonacci series using recursion

        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        //        int n3;
        //
        //        System.out.print("Enter the index of fibonacci series : ");
        //        n3 = input.nextInt();
        //
        //        System.out.println("Solution : "+ fib_rec_5(n3));

        // Question 6 : Write a function to find average of a set of numbers based as arguments

        //        int pass;
        //        int count =  0;
        //        int []arr;
        //
        //        System.out.print("Enter how many number you want to average : ");
        //        pass = input.nextInt();
        //
        //        System.out.println("Enter your numbers here : ");
        //        for (int i = 0; i < pass; i++)
        //        {
        //            count = input.nextInt();
        //            [i]arr;
        //        }

        // Question 7 : Repeat Question 4 using Recursion

        //        Mala yet nahi e

        // Question 8 : Repeat Question 2 using Recursion

        //        pattern_8(4);

        // Question 9 : Write a Function to convert  Celsius Temperature into Fahrenheit

        //        float cel;
        //
        //        System.out.print("Celsius : ");
        //        cel = input.nextFloat();
        //
        //        System.out.println("Conversion is : "+ convert_9(cel));


        // Question 10 : Repeat Question 3 using Iterative approach

        //        int n4;
        //
        //        System.out.print("Enter the digit you want to sum upto : ");
        //        n4 = input.nextInt();
        //
        //        System.out.println("The sum of first "+ n4 +" natural numbers are : "+ sum_iter_10(n4));

    }
}