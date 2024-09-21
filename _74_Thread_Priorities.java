package com.company;

class _74_Thread extends Thread
{
    public _74_Thread(String name)
    {
        super(name);
    }
    public void run()
    {
        while(true)
        {
            System.out.println("Thread Name : "+ this.getName());
        }
    }
}

public class _74_Thread_Priorities
{
    public static void main(String[] args)
    {
        _74_Thread t1 = new _74_Thread("Gaurav");
        _74_Thread t2 = new _74_Thread("Chinmay");
        _74_Thread t3 = new _74_Thread("Manish");

        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}