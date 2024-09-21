package com.company;

/**
 * This is a Method And Tags class
 */

public class _107_Method_Tags
{
    /**
     * @param args These are arguments supplied to the command line
     */

    public static void main(String[] args)
    {
        System.out.println("I'm main method");
    }

    /**
     * This is add method which takes 2 parameters , and return the value by adding them.
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */

    public int add(int i , int j) throws Exception
    {
        if(i == 0)
        {
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }
}