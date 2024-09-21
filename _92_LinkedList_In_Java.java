package com.company;
import java.util.*;

public class _92_LinkedList_In_Java
{
    public static void main(String[] args)
    {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(15);
        l2.add(18);
        l2.add(19);

        l1.add(6);
        l1.add(7);
        l1.add(0);
        l1.add(4);
        l1.add(0 , 5);
        l1.addAll(0 ,l2);
        l1.addLast(677);
        l1.addLast(999);

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