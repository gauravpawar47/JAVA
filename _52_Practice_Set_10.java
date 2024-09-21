package com.company;

class _52_Question_1_A
{
    public int radius;

    _52_Question_1_A(int r)
    {
        this.radius = r;
    }

    public double area()
    {
        return Math.PI * this.radius * this.radius;
    }
}

class _52_Question_1_B extends _52_Question_1_A
{
    public int height;

    _52_Question_1_B(int r , int h)
    {
        super(r);
        this.height = h;
    }

    public double volume()
    {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

class _52_Question_2_A
{
    int length;
    int width;
    int height;

    _52_Question_2_A(int l , int w , int h)
    {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public int area()
    {
        return length * width * height;
    }
}

class _52_Question_2_B extends _52_Question_2_A
{
    _52_Question_2_B(int l, int w, int h)
    {
        super(l, w, h);
    }
}

class _52_Question_3_A
{
    public int radius;

    public void setData(int r)
    {
        this.radius = r;
    }

    public double area()
    {
        return Math.PI * this.radius * this.radius;
    }
}

class _52_Question_3_B extends _52_Question_3_A
{
    public int height;

    public void setData(int r , int h)
    {
        setData(r);
        this.height = h;
    }

    public double volume()
    {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class _52_Practice_Set_10
{
    public static void main(String[] args)
    {
        // Question 1 - Create a Class circle and use inheritance to create another class Cylinder from it

        _52_Question_1_B obj = new _52_Question_1_B(4, 3);

        System.out.println();
        System.out.println("Volume of Cicle    : "+ obj.area());
        System.out.println("Volume of Cylinder : "+ obj.volume());

        // Question 2 - Create a class Rectangle and use Inheritance to create another class  Cuboid. Tru to keep it as close to real world Scenario as Possible

        _52_Question_2_B obj1 = new _52_Question_2_B(4 , 3 , 2);

        System.out.println();
        System.out.println("Volume of Rectangle : "+ obj1.area());
        System.out.println("Volume of Cuboid    : "+ obj1.area());

        // Question 3 - Create methods for area and volume in Question 1

        _52_Question_3_B obj2 = new _52_Question_3_B();

        obj2.setData(4 , 3);

        System.out.println();
        System.out.println("Volume of Circle   : "+ obj2.area());
        System.out.println("Volume of Cylinder : "+ obj2.volume());

        // Question 4 - Create methods for area and volume in Question 2. Also create getters and setters (Already Done)

        // Question 5 - What is the order of constructor execution for the following Inheritance Hierarchy

        // Base -> Derived_1 -> Derived_2

        // -> First the Base class default constructor will execute and then Derived_1 class Defualt constructor will execute and then Derived_2 class Defualt constructor will execute
     }
}