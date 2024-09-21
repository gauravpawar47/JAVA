package com.company;
import java.util.*;

public class _95_HashSet_In_Java
{
    public static void main(String[] args)
    {
        HashSet<Integer> myHashSet = new HashSet<>(7, 0.8f);

        myHashSet.add(7);
        myHashSet.add(10);
        myHashSet.add(13);
        myHashSet.add(88);
        myHashSet.add(61);
        myHashSet.add(11);
        myHashSet.add(11);

        System.out.println(myHashSet);
    }
}