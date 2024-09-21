package com.company;

public class _24_Break_And_Continue
{
    public static void main(String[] args)
    {
        // Break Statement And Continue Statement

        System.out.println("Inside the Loop");
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i);
            if(i == 3)
            {
                System.out.println("(*__*)");
                //break;
                continue;
            }
            System.out.println("-----");
        }
        System.out.println("Outside the Loop");

        System.out.println();

        int k = 1;
        System.out.println("Inside the Loop");
        while(k <= 5)
        {
            System.out.println(k);
            k++;
            if(k == 3)
            {
                System.out.println("(*__*)");
                //break;
                continue;
            }
            System.out.println("-----");
        }
        System.out.println("Outside the Loop");

        System.out.println();

        int j = 1;
        System.out.println("Inside the Loop");
        do
        {
            j++;
            System.out.println(j);
            if (j == 3)
            {
                System.out.println("(*__*)");
                //break;
                continue;
            }
            System.out.println("------");
        }while (j <= 5);
        System.out.println("Outside the Loop");
    }
}