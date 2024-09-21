package com.company;
import java.util.Scanner;

class _83_MyException extends Exception
{
    @Override
    public String toString()
    {
        return "I'm toString()";
    }

    @Override
    public String getMessage()
    {
        return "I'm getMessage()";
    }
}

public class _83_Exception_Class
{
    public static void main(String[] args)
    {
        int a;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        a = sc.nextInt();

        if(a < 9)
        {
            try
            {
                throw new ArithmeticException("Exception");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.getStackTrace();
                System.out.println(e);
            }
        }
    }
}