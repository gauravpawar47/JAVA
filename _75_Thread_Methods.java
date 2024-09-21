package com.company;

class _75_Thread_1 extends Thread
{
    public void run ()
    {
        int i = 0;

        while (true)
        {
            System.out.println("Thread 1 ");
            try
            {
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class _75_Thread_2 extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("Thread 2");
        }
    }
}

public class _75_Thread_Methods
{
    public static void main(String[] args)
    {
        _75_Thread_1 t1 = new _75_Thread_1();
        _75_Thread_2 t2 = new _75_Thread_2();

        t1.start();
        t2.start();
   }
}