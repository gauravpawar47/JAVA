package com.company;
import java.util.Scanner;

public class _25_Practice_Set_5
{
    public static void main(String[] args)
    {
        // Question 1 : Write a program to print the following pattern

        // ****
        // ***
        // **
        // *

        int n = 4;
        Scanner input = new Scanner(System.in);

        for (int i =n; i >= 1; i--)
        {
            for (int  j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        System.out.println();

        // Question 2 : Write a program to sum first n even numbers using while loop

        int n2 = 5;
        int sum = 0 , i = 0;

        while(i < n2)
        {
            sum =  sum + (2 * i);
            i++;
        }
        System.out.println("The sum of first "+ n2 +" natural numbers is : "+ sum);
        System.out.println();

        // Question 3 : Write a program to print multiplication table of given number n

        int n3;

        System.out.print("Enter the number that you want the multiplication table of : ");
        n3 = input.nextInt();

        for(int j = 1; j <= 10 ; j++)
        {
            System.out.printf("%d X %d = %d\n", n3 , j , n3 * j);
        }
        System.out.println();

        // Question 4 : Write a program to print multiplication table of 10 in Reverse order

        int n4 = 10;
        for(int k = 10; k>=1; k--)
        {
            System.out.printf("%d X %d = %d\n", k , n4 , k * n4 );
        }
        System.out.println();

        // Question 5 : Write a program to find factorial of a given number using for Loop

        int n5;
        int factorial = 1;

        System.out.print("Enter the number you want the factorial of : ");
        n5 = input.nextInt();

        for (int l = 1; l <= n5; l++)
        {
            factorial *= l;
        }
        System.out.println("The factorial of "+ n5 +" is : "+ factorial);
        System.out.println();

        // Question 6 : Repeat Question 5 using While loop

        int l2 = 1;
        int factorial2 = 1;

        while(l2 <= n5)
        {
            factorial2 *= l2;
            l2++;
        }
        System.out.println("The factorial of "+ n5 +" is : "+ factorial2);
        System.out.println();

        // Question 7 : Repeat Question 1 using While loop

        int i2 = 4;
        int j2 = 1;

        while(i2 >= 1)
        {
            while(j2 <= i2)
            {
                System.out.print("*");
                j2++;
            }
            i2--;
            System.out.printf("\n");
        }
        System.out.println();

        // Question 8 : What can be done using one type of loop can also be done using the other two types of loops - True or False
        // --> True

        // Question 9 : Write a Program to calculate the sum of the numbers occuring in the multiplication tables of 8

        int n6 = 8;
        int sum2 = 0;

        for (int m = 1; m <= 10; m++)
        {
            sum2 += n6 * m;
        }
        System.out.println(sum2);
        System.out.println();

        // Question 10 : A do while loop is executed :
        // 1) At Least Once
        // 2) At Least Twice
        // 3) At Most Once

        // --> 1) At Least Once

        // Question 11 : Repeat 2 Using For loop

        int n7 = 5;
        int sum3 = 0;

        for(int o = 0; o < n5 ; o++)
        {
            sum3 = sum3 + (2 * o);
        }
        System.out.println("The sum of first "+ n7 +" natural numbers is : "+ sum3);
        System.out.println();
    }
}