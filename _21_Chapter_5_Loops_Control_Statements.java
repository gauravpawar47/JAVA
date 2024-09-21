package com.company;
import java.util.Scanner;

public class _21_Chapter_5_Loops_Control_Statements
{
    public static void main(String[] args)
    {
        int i = 1;
        int n;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many times do you want to iterate the while loop : ");
        n = input.nextInt();

        while (i <= n) // Finite While loop
        {
            System.out.println("I'm in a while loop");
            i++;
        }

        System.out.println();

        //while (true) // Infinite While loop
        //{
        //    System.out.println("This is Infinite while loop");
        //}
    }
}