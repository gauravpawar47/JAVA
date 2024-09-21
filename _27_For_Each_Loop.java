package com.company;

public class _27_For_Each_Loop
{
    public static void main(String[] args)
    {
        /*
        We can create array of int , float , string

        float []marks = {98.5,85.4,75.3,96.4,85.2};
        String []students = {"Gaurav", "Chinmay", "Anuj" , "Manish"};

        System.out.println(students.length);
        System.out.println(students[2]);

        System.out.println(marks.length);
        System.out.println(marks[2]);
         */

        int[] marks = {98, 85, 74, 96, 82};
        // System.out.println(marks.length);

        // Displaying the array (Naive way)
        System.out.printf("\nPrinting the array using Naive Way\n");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the array (For Loop)
        System.out.printf("\nPrinting the array using For Loop\n");
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        // Quick Quiz : Displaying the array in Reverse Order (For Loop)
        System.out.printf("\nPrinting the Array using For loop in Reverse Order\n");
        for (int i = marks.length - 1; i >= 0; i--)
        {
            System.out.println(marks[i]);
        }

        // Quick Quiz : Displaying the array using For-Each Loop
        System.out.printf("\nPrinting the Array using For-Each Loop\n");
        for (int element : marks)
        {
            System.out.println(element);
        }
    }
}