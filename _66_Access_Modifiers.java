package com.company;

class _66_C1
{
    public int x = 5;
    protected int y = 6;
    int z = 7;
    private int a = 10;

    public void meth1()
    {
        System.out.println("X is : "+ x);
        System.out.println("Y is : "+ y);
        System.out.println("Z is : "+ z);
        System.out.println("A is : "+ a);
    }
}

public class _66_Access_Modifiers
{
    public static void main(String[] args)
    {
        _66_C1 obj = new _66_C1();

        // System.out.println("X is : "+ x); // Allowed (Public)
        // System.out.println("Y is : "+ y); // Allowed (Protected)
        // System.out.println("Z is : "+ z); // Allowed (Default)
        // System.out.println("A is : "+ a); // Not Allowed (Private)

        obj.meth1();
    }
}