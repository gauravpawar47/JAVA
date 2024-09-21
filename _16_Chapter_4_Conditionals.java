package com.company;
import java.util.Scanner;

public class _16_Chapter_4_Conditionals
{
    public static void main(String[] args)
    {
        int age;

        Scanner input= new Scanner(System.in);

        System.out.print("Enter your age to Join the Grand's Party : ");
        age = input.nextInt();

        if(age >= 50)
        {
            System.out.println("You can Join the Grand's Party");
        }
        else
        {
            System.out.println("You cannot Join the Grand's Party");
        }
    }
}