package com.company;

public class _33_VarArgs
{
    // Ye hai aam Zindagi (Method Overloading)

    //    static int sum(int a , int b)
    //    {
    //        return a + b;
    //    }

    //    static int sum(int a , int b , int c)
    //    {
    //        return a + b + c;
    //    }

    //    static int sum(int a , int b , int c , int d)
    //    {
    //        return a + b + c + d;
    //    }

    // Ye hai Mentos Zindagi (Var Args)

    static int sum(int ...arr)
    {
        int result = 0;

        for(int a : arr)
        {
            result += a;
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println("The sum of Nothing is : "+ sum());
        System.out.println("The sum of 5 and 2 is : "+ sum(5 ,2));
        System.out.println("The sum of 5 , 2 , 6 is : "+ sum(5 ,2 , 6));
        System.out.println("The sum of 5 , 2 , 7 , 8 is : "+ sum(5 ,2 , 7 , 8));
    }
}

// Gyan Ki Baat

//We are using varArgs because its saves times
//avoid rewriting the same logic
//and code looks clean and readable

//we can use method overloading also but upto an specific limit
//if the number arguments are increasing by one and the agruments size is 'n'
//then its not recommended to use method overloading instead we have a varArgs