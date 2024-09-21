package com.company;

public class _10_Expressions_Increment_Decrement
{
    public static void main(String[] args)
    {
        byte x = 5;
        int y= 6;
        short z= 8;
        int a = y +z;
        float b = 6.54f + x;

        System.out.println(a);
        System.out.println(b);

        // Increment and Decrement Operator

        int i = 56;
        int b2 = i++; // first b2 is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented and then c is assigned j(68)

        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

        int y2 = 7;
        System.out.println(++y2 * 8);

        char ch  = 'B';
        System.out.println(++ch);

    }
}