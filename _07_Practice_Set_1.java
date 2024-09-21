package com.company;
import java.util.Scanner;

public class _07_Practice_Set_1
{
    public static void main(String[] args)
    {
        // Question 1 --> Write a program to sum 3 numbers in Java.

        int a = 10;
        int b = 20;
        int c = 5;

        int sum = a + b + c;
        System.out.println("The sum is " + sum);
        System.out.println();

        // Question 2 --> Write a program to calculate CGPA using marks of 3 subjects (out of 100).

        float sub1 = 90;
        float sub2 = 80;
        float sub3 = 92;

        float percentage = (sub1 + sub2 + sub3 ) / 3;
        System.out.println("Your percentage is " + percentage);
        System.out.println();

        // Question 3 --> Write a program which asks the user to enter his / her name and greets them with "Hello <name> , have a good day" text.

        System.out.print("Enter your name : ");
        Scanner input = new Scanner (System.in);
        String str = input.nextLine();
        System.out.println("Hello " + str + " have a good day\n");
        System.out.println();

        // Question 4 --> Write a Java program to convert Kilometers to Miles.

        System.out.print("Enter the kilometers : ");
        double kms = input.nextInt();
        double convert = 0.621371 * kms;
        System.out.println("The conversion is : " + convert);
        System.out.println();

        // Question 5 --> Write a Java Program to detect whether a number entered by the user is Integer or not.

        System.out.print("Enter the number : ");
        boolean check = input.hasNextInt();
        System.out.println("Status is : " + check);
        System.out.println();

    }
}