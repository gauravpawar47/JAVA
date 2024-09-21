package com.company;
import java.io.FileWriter;
import java.io.IOException;

class _112_MyDeprecated
{
    @Deprecated
    void meth1()
    {
        System.out.println("I'm Method 1");
    }
}

interface _112_MyInt
{
    void display();
}

public class _112_Practice_Set_16_Advanced_Java_Ch_2
{
    public static void main(String[] args)
    {
        // Question 1 - Create a javadoc from a java program using intelliJ and without using intelliJ

        //--> Done

        // Question 2 - Create a class and method with deprecated annotation . What is its effect on program execution ?

        // --> just interpreter throw warnings

        _112_MyDeprecated obj1 = new _112_MyDeprecated();
        obj1.meth1();

        // Question 3 - Suppress the warning generated in question number 1

        @SuppressWarnings("Deprecation")
        _112_MyDeprecated obj2 = new _112_MyDeprecated();
        obj2.meth1();

        // Question 4 - Create an interface and generate an instance from it.

        _112_MyInt obj3 = ()-> System.out.println("I'm Display");
        obj3.display();

        // Question 5 - Write a java program to generate a multiplication table of given number and write it to a file

        int i = 7;
        String table = "";

        for (int j = 0; j < 10; j++)
        {
            table += i +" X "+ (j + 1) +" = "+ i * (j + 1);
            table += "\n";
        }

        try
        {
            FileWriter fileWriter = new FileWriter("_112_Question_5.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}