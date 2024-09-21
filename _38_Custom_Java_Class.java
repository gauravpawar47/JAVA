package com.company;

class _38_Employee
{
    int id;
    String name;
    int salary;

    public void printDetails()
    {
        System.out.println("Id     : "+ id);
        System.out.println("Name   : "+ name);
        System.out.println("Salary : "+ salary);
    }
}

public class _38_Custom_Java_Class
{
    public static void main(String[] args)
    {
        _38_Employee gaurav = new _38_Employee(); // Instantiating a new Employee Object

        // Setting Attributes
        gaurav.id = 47;
        gaurav.name = "Gaurav";
        gaurav.salary = 500;

        // Printing Attributes
        gaurav.printDetails();
    }
}