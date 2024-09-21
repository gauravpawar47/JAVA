package com.company;

@FunctionalInterface
interface _109_DemoAno
{
    void meth1(int a);
    // void meth2();
}

//class _109_studentFunc implements _109_DemoAno
//{
//    @Override
//    public void meth1(int a)
//    {
//        System.out.println("This is meth 1");
//    }
//}

//class _109_AnonyDemo implements _109_DemoAno
//{
//    public void display()
//    {
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1(int a)
//    {
//        System.out.println("I am meth1");
//    }
//}

public class _109_Anonymous_Classes_And_Lamda
{
    public static void main(String[] args)
    {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();

        // Anonymous Class

        _109_DemoAno obj = new _109_DemoAno()
        {
            @Override
            public void meth1(int a)
            {
                System.out.println("I'm meth 1");
            }
        };
        obj.meth1(5);

        // Lamda Expression

//        _109_DemoAno obj = new _109_studentFunc();
//        obj.meth1();

        _109_DemoAno obj1 = (a)->
        {
            System.out.println("I'm method 1 from this Lamda "+ a);
        };
        obj.meth1(6);
    }
}