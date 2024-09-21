package com.company;

class _46_Base
{
    _46_Base()
    {
        System.out.println("I'm a Base Class Constructor");
    }
    _46_Base(int x)
    {
        System.out.println("Value of x : "+ x);
    }
}

class _46_Derived extends  _46_Base
{
    _46_Derived()
    {
        // super(0);
        System.out.println("I'm a Derived Class Constructor");
    }
    _46_Derived(int x , int y)
    {
        super(x);
        System.out.println("Value of y : "+ y);
    }
}

class _46_ChildOfDerived extends  _46_Derived
{
    _46_ChildOfDerived()
    {
        System.out.println("I'm a Child Class Constructor");
    }
    _46_ChildOfDerived(int x , int y , int z)
    {
        super(x , y);
        System.out.println("Value of z : "+ z);
    }
}

public class _46_Constructors_In_Inheritance
{
    public static void main(String[] args)
    {
        // _46_Base b = new _46_Base();
        // _46_Derived d = new _46_Derived();
        // _46_Derived d2 = new _46_Derived(13 ,6);
        // _46_ChildOfDerived cd = new _46_ChildOfDerived();
        _46_ChildOfDerived cd = new _46_ChildOfDerived(12 , 13 , 14);
    }
}