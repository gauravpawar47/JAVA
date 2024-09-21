package com.company;

interface _58_sampleInterface
{
    void meth1();
    void meth2();
}

interface _58_childSampleInterface extends _58_sampleInterface
{
    void meth3();
    void meth4();
}

class _58_MySampleClass implements _58_childSampleInterface
{
    public void meth1() {
        System.out.println("Meth1()");
    }

    public void meth2() {
        System.out.println("Meth2()");
    }

    public void meth3() {
        System.out.println("Meth3()");
    }

    public void meth4() {
        System.out.println("Meth4()");
    }
}

public class _58_Inheritance_In_Interfaces_
{
    public static void main(String[] args)
    {
        _58_MySampleClass obj1 = new _58_MySampleClass();

        obj1.meth1();
        obj1.meth2();
        obj1.meth3();
        obj1.meth4();
    }
}