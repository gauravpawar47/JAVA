package com.company;

class _49_Phone
{
    public void showTime()
    {
        System.out.println("Time is 8 am");
    }
    public void on()
    {
        System.out.println("Turning on Phone");
    }
}

class _49_SmartPhone extends _49_Phone
{
    public void music()
    {
        System.out.println("Playing music ...");
    }
    public void on()
    {
        System.out.println("Turning on SmartPhone ...");
    }
}

public class _49_Dynamic_Dispatch
{
    public static void main(String[] args)
    {
        // _49_Phone obj = new _49_Phone(); // Allowed
        // _49_SmartPhone smobj = new _49_SmartPhone(); // Allowed
        // obj.name();

        _49_Phone obj = new _49_SmartPhone(); // Yes it is allowed
        // _49_SmartPhone obj2 = new _49_Phone(); // Not allowed

        obj.showTime();
        obj.on();

        // obj.music(); // Not allowed
    }
}