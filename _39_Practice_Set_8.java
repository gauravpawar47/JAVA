package com.company;

class _39_Question_1
{
    int salary;
    String name;

    public int getSalary()
    {
        return salary;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
}

class _39_Question_2
{
    public void ring()
    {
        System.out.println("Ringing");
    }
    public void vibrate()
    {
        System.out.println("Vibrate");
    }
}

class _39_Question_3
{
    int side;

    public int area()
    {
        return side * side;
    }
    public int perimeter()
    {
        return  4 * side;
    }
}

class _39_Question_4
{
    int length;
    int width;

    public int perimeter()
    {
        return 2 * (length + width);
    }
    public int area()
    {
        return length * width;
    }
}

class _39_Question_5
{
    public void hit()
    {
        System.out.println("Hitting the enemy");
    }
    public  void run()
    {
        System.out.println("Running from the enemy");
    }
    public void fire()
    {
        System.out.println("Firing on the enemy");
    }
}

class _39_Question_6
{
    float radius;

    public float area()
    {
        return 3.14f * radius * radius;
    }
    public  float perimeter()
    {
        return 2.00f * 3.14f * radius;
    }
}

public class _39_Practice_Set_8
{
    public static void main()
    {
        // Question 1 : Create a Class Employee with following properties

        _39_Question_1 gaurav = new _39_Question_1();

        gaurav.setName("student47");
        gaurav.salary = 100000;

        System.out.println("Your Name   : "+ gaurav.getSalary());
        System.out.println("Your Salary : "+ gaurav.getName());
        System.out.println();

        // Question 2 : Create a Class cellphone with methods to print ringing , vibrating

        _39_Question_2 asus = new _39_Question_2();

        asus.ring();
        asus.vibrate();
        System.out.println();

        // Question 3 : Create a Class Square with a method to initialize its side , calculating area , perimeter etc.

        _39_Question_3 square = new _39_Question_3();

        square.side = 5;
        System.out.println("Area of Square      : "+ square.area());
        System.out.println("Perimeter of Square : "+ square.perimeter());
        System.out.println();

        // Question 4 : Create a Class Rectangle and Repeat Question 3

        _39_Question_4 rectangle = new _39_Question_4();

        rectangle.width = 4;
        rectangle.length = 2;

        System.out.println("Area of Rectangle : "+ rectangle.area());
        System.out.println("Perimeter of Rectangle : "+ rectangle.perimeter());
        System.out.println();

        //  Question 5 : Create a Class Play1 for Rockstar games capable of hitting , running , firing (printing all the statements) etc

        _39_Question_5 play1 = new _39_Question_5();

        play1.fire();
        play1.hit();
        play1.run();
        System.out.println();

        // Question 6 : Repeat Question 4 for a Circle

        _39_Question_6 circle = new _39_Question_6();

        circle.radius = 4.55f;
        System.out.println("Area of Circle      : "+ circle.area());
        System.out.println("Perimeter of Circle : "+ circle.perimeter());
        System.out.println();

    }
}