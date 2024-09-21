package com.company;
import java.util.ArrayList;

class _110_Generic<T1 , T2>
{
    int val;
    private T1 t1;
    private T2 t2;

    public _110_Generic(int val , T1 t1 , T2 t2)
    {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public T1 getT1()
    {
        return t1;
    }

    public void setT1(T1 t1)
    {
        this.t1 = t1;
    }

    public T2 getT2()
    {
        return t2;
    }

    public void setT2(T2 t2)
    {
        this.t2 = t2;
    }

    public int getVal()
    {
        return val;
    }

    public void setVal(int val)
    {
        this.val = val;
    }
}

public class _110_Java_Generics
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList();
//        ArrayList<int> arrayList = new ArrayList(); -- this will produce an error
//        arrayList.add("str1");
        arrayList.add(54);
        arrayList.add(643);

        int a = (int) arrayList.get(0);

        _110_Generic<String, String> g1 = new _110_Generic<>(47 , "student47", "Gaurav Pawar");

        String str1 = g1.getT1();
        String str2 = g1.getT2();
        int a2 = g1.getVal();

        System.out.println("Roll      : "+ a2);
        System.out.println("User Name : "+ str1);
        System.out.println("Real Name : "+ str2);
    }
}