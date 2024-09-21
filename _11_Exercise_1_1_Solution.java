package com.company;
import java.util.Scanner;

public class _11_Exercise_1_1_Solution
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the marks of sub1 : ");
        float sub1 = input.nextFloat();

        System.out.print("Enter the marks of sub2 : ");
        float sub2 = input.nextFloat();

        System.out.print("Enter the marks of sub3 : ");
        float sub3 = input.nextFloat();

        System.out.print("Enter the marks of sub4 : ");
        float sub4 = input.nextFloat();

        System.out.print("Enter the marks of sub5 : ");
        float sub5 = input.nextFloat();

        float percentage = ((sub1 + sub2 + sub3 + sub4 + sub5) / 5);

        System.out.println();
        System.out.println("Your percentage is : " + percentage);
    }
}