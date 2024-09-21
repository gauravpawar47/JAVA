package com.company;

class _84_NRE extends Exception
{
    @Override
    public String toString()
    {
        return "Radius Cannot be Negative";
    }
}

public class _84_Throw_Throws
{
    public static double area(int r) throws _84_NRE
    {
        if(r < 0)
        {
            throw new _84_NRE();
        }
        double result = Math.PI * r * r;
        return result; 
    }

    public static int divide(int a, int b)
    {
        if(a == 0 || b == 0)
        {
            throw new ArithmeticException("Cannot Divide with 0");
        }
        else
        {
            return a / b;
        }
    }

    public static void main(String[] args)
    {
        try
        {
            double ar = area(6);
            System.out.println("Area : "+ ar);
        }
        catch (Exception e)
        {
            System.out.println("Exception : "+ e);
        }

        int a = 12;
        int b = 6;

        System.out.println("a / b : "+ divide(a , b));
    }
}