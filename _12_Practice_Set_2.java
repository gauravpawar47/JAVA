package com.company;
import java.util.Scanner;

public class _12_Practice_Set_2
{
    public static void main(String[] args)
    {
        // Question 1 --> What will be the result of the following Expression (float a = 7 /4 * 9 / 2)

        float a = 7 / 4.0f * 9 / 2.0f;

        System.out.println();
        System.out.println("The value is : "+ a);

        // Question 2 --> Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade

        char grade = 'A';
        grade = (char) (grade + 7);

        System.out.println();
        System.out.println("The Grade is : " + grade);

        grade = (char) (grade - 7);
        System.out.println("The Grade is : "+ grade);

        // Question 3 --> Use comparison operator to find out whether a given number is greater than the user entered number or not

        Scanner input = new Scanner(System.in);

        System.out.println();
        int check = input.nextInt();

        System.out.println( check > 47);

        // Question 4 --> Write the following expression in Java Program

        // System.out.println();
        // int expression = ((v * v - u * u ) / (2 * a * s));

        // Question 5 --> Find the value of the following expression :

        int exp1 = 7;
        int exp2 = 7 * 49 / 7 + 35 / 7;

        System.out.println();
        System.out.println("The value is : "+ exp2);
    }
}