package com.company;

@FunctionalInterface
interface _108_Function_Interface
{
    void thisMethod();
}

class _108_NewPhone extends _49_Phone
{
    @Override
    public void showTime()
    {
        System.out.println("This is 8 PM");
    }
    @Deprecated
    public int sum(int a, int b)
    {
        return a + b;
    }
}

public class _108_Annotations_In_Java
{
    @SuppressWarnings("Deprecation")
    public static void main(String[] args)
    {
        _108_NewPhone phone = new _108_NewPhone();
        phone.showTime();
        phone.sum(5 , 2);
    }
}