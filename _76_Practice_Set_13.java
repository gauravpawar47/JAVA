package com.company;

class _76_Question_1A extends Thread
{
    public void run()
    {
        while(true)
        {
//            try
//            {
//                Thread.sleep(200);
//            }
//            catch(Exception e)
//            {
//                System.out.println(e);
//            }

            System.out.println("Good Morning");
        }
    }
}

class _76_Question_1B extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Welcome");
        }
    }
}

public class _76_Practice_Set_13
{
    public static void main(String[] args)
    {
        // Question 1 : Write a program to print "Good Morning" and "Welcome" continuously on the screen in java Using Threads

        _76_Question_1A obj1 = new _76_Question_1A();
        _76_Question_1B obj2 = new _76_Question_1B();

        // obj1.start();
        // obj2.start();

        // Question 2 : Add a sleep method in welcome thread of Question 1 to delay its execution for 200 ms

        // Done

        // Question 3 : Demonstrate getPriority() and setPriority() methods in Java Threads

        obj1.setPriority(7);
        obj2.setPriority(1);

        System.out.println();
        System.out.println("1A : "+ obj1.getPriority());
        System.out.println("1B : "+ obj2.getPriority());

        // Question 4 : How do you get state of a given thread in Java ?

        System.out.println();
        System.out.println("1A : "+ obj1.getState());
        System.out.println("1B : "+ obj2.getState());

        // Question 5 : How do you get reference to the current Thread in Java ?

        System.out.println();
        System.out.println("1A : "+ Thread.currentThread().getState());
        System.out.println("1B : "+ Thread.currentThread().getState());
    }
}