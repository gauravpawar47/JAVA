package com.company;

abstract class _53_Parent
{
    public _53_Parent()
    {
        System.out.println("I'm Parent Constructor");
    }

    public void sayHello()
    {
        System.out.println("Hello");
    }

    abstract public void greet();
    abstract public void greet2();
}

class _53_Child extends _53_Parent
{
    @Override
    public void greet()
    {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2()
    {
        System.out.println("Good Afternoon");
    }
}

abstract class _53_Child2 extends  _53_Parent
{
    public void sample()
    {
        System.out.println("I'm Good");
    }
}

class _53_Chapter_11_Abstract_Class_And_Abstract_Methods
{
    public static void main(String[] args)
    {
        // _53_Parent p = new _53_Parent(); -- throws an error
        _53_Child c = new _53_Child();
        // _53_Child2 c2 = new _53_Child2(); -- throws an error
    }
}