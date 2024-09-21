package com.company;

class _71_RunnableThread1 implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("Runnable Thread 1");
        }
    }
}

class _71_RunnableThread2 implements Runnable
{
    public void run()
    {
        for(int i = 0; i < 1000; i++)
        {
            System.out.println("Runnable Thread 2");
        }
    }
}

public class _71_Runnable_Thread
{
    public static void main(String[] args)
    {
        _71_RunnableThread1 bullet1 = new _71_RunnableThread1();
        Thread gun1 = new Thread(bullet1);

        _71_RunnableThread2 bullet2 = new _71_RunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}