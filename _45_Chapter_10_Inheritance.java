package com.company;

class _45_Base
{
    public int x;

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        System.out.println("I'm in base and setting x now");
        this.x = x;
    }

    public void printMe()
    {
        System.out.println("I'm a Constructor");
    }
}

class _45_Derived extends  _45_Base
{
    public int y;

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}

public class _45_Chapter_10_Inheritance
{
    public static void main(String[] args)
    {
        // Creating an object of Base class

        _45_Base b = new _45_Base();
        b.setX(5);
        System.out.println("The value of b is : "+ b.getX());

        // Creating an object of Derived class

        _45_Derived d = new _45_Derived();
        d.setY(45);
        System.out.println("The value of d is : "+ d.getY());
    }
}