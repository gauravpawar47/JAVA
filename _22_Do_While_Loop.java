package com.company;
import java.util.Scanner;

public class _22_Do_While_Loop
{
    public static void main(String[] args)
    {
        int digit;
        int iterater  = 1;

        Scanner input = new Scanner (System.in);

        System.out.print("How many round you want to iterate the loop : ");
        digit = input.nextInt();

        do
        {
            System.out.println(iterater);
            iterater++;
        }while(iterater <= digit);
    }
}