package com.company;
import java.util.Scanner;

public class _34_Recursion
{
    static int fact_recusrive(int n)
    {
        if(n == 1 || n == 0)
        {
            return 1;
        }
        else
        {
            return n * fact_recusrive(n - 1);
        }
    }

    static int fact_iterative(int n)
    {
        int product = 1;

        if(n == 1 || n == 0)
        {
            return  1;
        }
        else
        {
            for (int i = 1; i <= n; i++)
            {
                product = product * i;
            }

            return product;
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the number that you want the factorial of : ");
        n = input.nextInt();

        System.out.println("The factorial of "+ n +" using recursive approach is : "+ fact_recusrive(n));
        System.out.println("The factorial of "+ n +" using iterative approach is : "+ fact_iterative(n));
    }
}