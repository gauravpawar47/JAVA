package com.company;

class _44_Cylinder
{
    private int radius;
    private int height;

    public _44_Cylinder(int radius , int height)
    {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius()
    {
        return  radius;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }

    public double surfaceArea()
    {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public  double volume()
    {
        return Math.PI * radius * radius * height;
    }
}

class _44_Rectangle
{
    private int length;
    private int breadth;

    public  _44_Rectangle()
    {
        this.length = 5;
        this.breadth = 2;
    }
    public  _44_Rectangle(int length , int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength()
    {
        return length;
    }

    public int getBreadth()
    {
        return breadth;
    }
}

class _44_Sphere
{
    private int radius;

    public void setRadius(int a)
    {
        radius = a;
    }
    public int getRadius()
    {
        return radius;
    }
}

public class _44_Practice_Set_9
{
    public static void main(String[] args)
    {
        // Question 1 : Create a Class Cylinder and use getters and setters to set is Radius and Height

        _44_Cylinder myCylinder = new _44_Cylinder(6 , 3);

        myCylinder.setRadius(3);
        myCylinder.setHeight(6);

        System.out.println();
        System.out.println("Radius : "+ myCylinder.getRadius());
        System.out.println("Height : "+ myCylinder.getHeight());

        // Question 2 : Use Question 1 to Calculate Surface area and Volume of the Cylinder

        System.out.println();
        System.out.println("Surface area : "+ myCylinder.surfaceArea());
        System.out.println("Volume       : "+ myCylinder.volume());

        // Question 3 : Use a Constructor and repeat Question 1

        _44_Cylinder myCylinder2 = new _44_Cylinder(6 , 3);

        System.out.println();
        System.out.println("Radius : "+ myCylinder2.getRadius());
        System.out.println("Height : "+ myCylinder2.getHeight());

        // Question 4 : Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using Custom Parameters

        _44_Rectangle r = new _44_Rectangle(12 ,56);

        System.out.println();
        System.out.println("Length  : "+ r.getLength());
        System.out.println("Breadth : "+ r.getBreadth());

        // Question  5 : Repeat Question 1 for a Sphere

        _44_Sphere s = new _44_Sphere();

        s.setRadius(5);

        System.out.println();
        System.out.println("Radius : "+ s.getRadius());
    }
}