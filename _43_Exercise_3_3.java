package com.company;
import java.util.Random;
import java.util.Scanner;

public class _43_Exercise_3_3
{
    public static boolean guessNumber(int n)
    {
        int random;
        boolean b1 = true;
        boolean b2 = false;

        Random rand = new Random();
        random = 1 + rand.nextInt(3);

        if (n == random)
        {
            return b1;
        }
        else
        {
            return b2;
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number : ");
        n = input.nextInt();

        if(guessNumber(n))
        {
            System.out.println("Right Number");
        }
        else
        {
            System.out.println("Wrong Number");
        }
    }
}