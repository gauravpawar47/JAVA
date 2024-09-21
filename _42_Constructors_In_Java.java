package com.company;

class _42_Employee
{
    private int id;
    private String name;

    public _42_Employee()
    {
        id = 0;
        name = "Enter_Your_Name";
    }
    public _42_Employee(String n, int i)
    {
        name = n;
        id = i;
    }

    public void display()
    {
        System.out.println("Your Name : "+ name);
        System.out.println("Your id   : "+ id);
    }
}

public class _42_Constructors_In_Java
{
    public static void main(String[] args)
    {
        _42_Employee gaurav = new _42_Employee("student47", 47); // <-- Calling Parameterised Constructor
        // _42_Employee gaurav = new _42_Employee(); // <-- Calling default constructor

        gaurav.display();
    }
}