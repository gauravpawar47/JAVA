package com.company;
import java.util.Scanner;

public class _05_Input_Output
{
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user : ");
        Scanner input = new Scanner (System .in);

        System.out.print("Enter the number 1 : ");
        int a = input.nextInt();

        System.out.print("Enter the number 2 : ");
        int b = input.nextInt();
        int sum = a + b;

        System.out.print("The sum is : ");
        System.out.println(sum);

        //  System.out.print("\nChecking the number is number is integer or not : ");
        //  boolean b1 = input.hasNextInt();
        //  System.out.println(b1);

        //  System.out.println("Taking string in the input");
        //  String str = input.nextLine();
       //   System.out.println(str);

    }
}