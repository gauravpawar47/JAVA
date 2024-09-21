package com.company;

class _47_EkClass
{
    int a;

    _47_EkClass(int a)
    {
        this.a = a;
    }

    public int getA()
    {
        return a;
    }

    public int returnone()
    {
        return 1;
    }
}

class _47_DoClass extends _47_EkClass
{
    _47_DoClass(int c)
    {
        super(c);
        System.out.println("I'm a Constructor");
    }
}

public class _47_This_And_Super_Keyword
{
    public static void main(String[] args)
    {
        _47_EkClass d = new _47_EkClass(5);
        _47_DoClass e = new _47_DoClass(65);

        System.out.println(d.getA());
    }
}