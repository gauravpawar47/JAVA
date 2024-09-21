package com.company;
import java.util.Scanner;

public class _81_Specific_Exception
{
    public static void main(String[] args)
    {
        int []marks = new int[3];
        marks[0] = 55;
        marks[1] = 25;
        marks[2] = 45;

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the Array Index : ");
        int index = sc.nextInt();

        System.out.print("Enter the number you want to divide the value with : ");
        int number = sc.nextInt();

        try
        {
            System.out.println("Array index   : "+ marks[index]);
            System.out.println("Dividation is : "+ marks[index] / number);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}