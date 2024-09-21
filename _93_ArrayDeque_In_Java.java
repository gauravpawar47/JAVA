package com.company;
import java.util.*;

public class _93_ArrayDeque_In_Java
{
    public static void main(String[] args)
    {
        ArrayDeque <Integer> ad1 = new ArrayDeque<>();

        ad1.add(7);
        ad1.add(71);
        ad1.add(67);
        ad1.add(30);
        ad1.add(60);

        ad1.addFirst(6);
        ad1.addLast(9999);
        ad1.add(7777);

        System.out.print(ad1.getFirst()+ " ");
    }
}