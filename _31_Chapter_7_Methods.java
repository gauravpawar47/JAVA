package com.company;

public class _31_Chapter_7_Methods
{
    static int sum(int x , int y)
    {
        return x + y;
    }

    public static void main(String[] args)
    {
        int a = 7;
        int b = 3;
        int sum = sum(a , b);

        // Another way to invoaction function / Method

        // _31_Chapter_7_Methods obj = new _31_Chapter_7_Methods();
        // int sum = obj.sum(a, b);

        System.out.println("The value of a is : "+ a);
        System.out.println("The value of b is : "+ b);
        System.out.println("The sum is : "+ sum);
    }
}