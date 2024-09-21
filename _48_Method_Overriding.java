package com.company;

class _48_A
{
    public int a;

    public int harry()
    {
        return 4;
    }
    public void meth2()
    {
        System.out.println("I'm a method 2 of class A");
    }
}

class _48_B extends _48_A
{
    @Override
    public void meth2()
    {
        System.out.println("I'm a method 2 of class B");
    }
    public void meth3()
    {
        System.out.println("I'm a method 3 of class B");
    }
}

public class _48_Method_Overriding
{
    public static void main(String[] args)
    {
        _48_A a = new _48_A();
        a.meth2();

        _48_B b = new _48_B ();
        b.meth2();
    }
}