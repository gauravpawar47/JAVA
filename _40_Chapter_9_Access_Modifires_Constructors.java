package com.company;

class _40_Employee
{
    private int id;
    private String name;

    public void setData(String n, int i)
    {
        name = n;
        id = i;
    }
    public void getData()
    {
        System.out.println("Name : "+ name);
        System.out.println("Id   : "+ id);
    }
}

public class _40_Chapter_9_Access_Modifires_Constructors
{
    public static void main(String[] args)
    {
        _40_Employee gaurav = new _40_Employee();

        gaurav.setData("student47", 4);
        gaurav.getData();
    }
}