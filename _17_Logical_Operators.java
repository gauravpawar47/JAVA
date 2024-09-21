package com.company;

public class _17_Logical_Operators
{
    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;

        System.out.println();
        System.out.println("Logical AND Operator");

        if (a && b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println();
        System.out.println("Logical OR Operator");

        if (a || b)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("N");
        }

        System.out.println();
        System.out.println("Logical NOT Operator");

        System.out.println("!(a) : "+ !(a));
        System.out.println("!(b) : "+ !(b));
    }
}