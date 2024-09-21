package com.company;

public class _26_Chapter_6_Arrays
{
    public static void main(String[] args)
    {
        /*
        Classroom of 500 students - You have to store the marks of these 500 students
        You have 2 Option :
        1) Create 500 Variables
        2) Use Arrays (Recommended)
         */

        // There are three main ways to create an array in java

        //    1. Declaration and memory allocation
        //    int [] marks = new int[5];

        //    2. Declaration and then memory allocation
        //    int [] marks;
        //    marks = new int[5];

        // Initialization
        // marks[0] = 100;
        // marks[1] = 90;
        // marks[2] = 50;
        // marks[3] = 80;
        // marks[4] = 60;

        // 3. Declaration , memory allocation and initialization together
        int [] marks = {98,45,79,99,80};

        // marks[5] = 96; - Throws an error
        System.out.println(marks[4]);
    }
}