package com.company;
import java.util.*;

public class _91_ArrayList_In_Java
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(0);
        l1.add(100);
        l1.add(10);
        l1.add(4);
        l1.add(0 , 5);
        l1.addAll(0 ,l2);

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(19));

        l1.set(1, 666);

        for (int i = 0; i < l1.size(); i++)
        {
            System.out.print(l1.get(i)+ " ");
        }
    }
}