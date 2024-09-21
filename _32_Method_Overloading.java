package com.company;

public class _32_Method_Overloading
{
    static void foo()
    {
        System.out.println("Good Morning Bro !");
    }

    static void foo(String a)
    {
        System.out.println("Good Morning " + a);
    }

    static void foo(String a, String b) // <-- Here function taking Parameters
    {
        System.out.println("Good Morning " + a);
        System.out.println("Good Morning " + b);
    }

    static void change(int a)
    {
        a = 01;
    }

    static void change(int []arr)
    {
        arr[0]= 7;
    }

    static void tellJoke()
    {
        System.out.println("Go to Hell");
    }

    public static void main(String[] args)
    {
        // tellJoke();

        // Case 1 : Changing the Integer

         int x = 45;
         change(x); // <-- Value will not change because we are not passing the address of the variable we are passing the variable copy
         System.out.println("The value of x after running change is : "+ x);

        // Case 2 : Changing the Array

         int []arr = {8 , 4 , 1 , 6 , 7};
         change(arr); // <-- This passing can change the value of arr (array) because here the array is declare in the memeory block and the name of array (arr) is taking reference of that memory block and hence we are passing reference (address) we can change the value of array (arr)
         System.out.println("The value of arr[0] after running the change is : "+ arr[0]);

        // Method Overloading

         foo();
         foo("student47");
         foo("student47" , "Denver");  // <-- Here function taking arguments

        // Method Overloading can be done by changing the parameters of the function and even without changing the name and return type of it
    }
}