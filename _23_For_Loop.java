package com.company;
import java.util.Scanner;

public class _23_For_Loop
{
    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number that you want to iterate : ");
        n = input.nextInt();

        // Normal For Loop

        for (int i = 1; i <= n; i++)
        {
            System.out.println(i);
        }
        System.out.println();

        // Odd Number Printing For - Loop

        for (int i = 0; i < n ; i++)
        {
            System.out.println(2 * i + 1);
        }
        System.out.println();

        // Reverse Number Printing For - Loop

        for(int i = n; i != 0; i--)
        {
            System.out.println(i);
        }
        System.out.println();
    }
}