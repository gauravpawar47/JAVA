package com.company;

class _70_MyThread1 extends Thread
{
    public void run()
    {
        int i = 0;
        while(i < 4)
        {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class _70_MyThread2 extends Thread
{
    public void run()
    {
        int i = 0;
        while(i < 4)
        {
            System.out.println("Thread 2 is running");
            i++;
        }
    }
}

public class _70_Creating_Thread
{
    public static void main(String[] args)
    {
        _70_MyThread1 t1 = new _70_MyThread1();
        _70_MyThread2 t2 = new _70_MyThread2();

        t1.start();
        t2.start();
    }
}