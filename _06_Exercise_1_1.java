package com.company;
import java.util.Scanner;

public class _06_Exercise_1_1
{
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user");
        Scanner input = new Scanner (System.in);

        System.out.print("1st subject marks : ");
        int sub1 = input.nextInt();

        System.out.print("2nd subject marks : ");
        int sub2 = input.nextInt();

        System.out.print("3rd subject marks : ");
        int sub3 = input.nextInt();

        System.out.print("4th subject marks : ");
        int sub4 = input.nextInt();

        System.out.print("5th subject marks : ");
        int sub5 = input.nextInt();

        int sum = sub1 + sub2 + sub3 + sub4 + sub5;
        int percentage = sum / 5;

        System.out.print("\nYour percentage as follows : ");
        System.out.println(percentage);

    }
}