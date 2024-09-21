package com.company;

class _73_MyThread extends Thread
{
    public _73_MyThread(String name)
    {
        super(name);
    }

    public void run()
    {
        int i = 34;
    }
}

public class _73_Constructors_From_Thread_Class
{
    public static void main(String[] args)
    {
        _73_MyThread th1 = new _73_MyThread("Gaurav");
        _73_MyThread th2 = new _73_MyThread("Chinmay");

        th1.start();
        th2.start();

        System.out.println("th1 Name : "+ th1.getName());
        System.out.println("th1 I'd  : "+ th1.getId());

        System.out.println();

        System.out.println("th2 Name : "+ th2.getName());
        System.out.println("th2 I'd  : "+ th2.getId());
    }
}
