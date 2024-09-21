package com.company;
import java.util.Scanner;

public class _79_Errors
{
    public static void main(String[] args)
    {
        // SYNTAX ERROR DEMO

        // int a = 0 // Error : No Semicolon
        // b = 8; // Error : B Not Declared

        // LOGICAL ERROR DEMO

        System.out.println(2);
        for (int i = 1; i < 5; i++)
        {
            System.out.println(2 * i + 1);
        }

        // RUNTIME ERROR DEMO

        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Divided b 1000 : "+ 1000 / k);
    }
}