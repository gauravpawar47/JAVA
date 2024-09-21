package com.company;

public class _08_Chpater_2_Operators
{
    public static void main(String[] args)
    {
        // 1. Arithmetic Operator

        int a = 6;
        int b = 10;
        int sum = a + b;

        System.out.println();
        System.out.println("The Addition is       : "+ (a + b));
        System.out.println("The Substraction is   : "+ (a - b));
        System.out.println("The Multiplication is : "+ (a * b));
        System.out.println("The Division is       : "+ (a / b));
        System.out.println("The Modulus is        : "+ (a % b));

        // 2. Assignment Operator

        // int c = 9;
        // c += a;

        // System.out.println("\n\n"+ c);

        // 3. Comparison Operator

        System.out.println();
        System.out.println("This is Equality comparison between 6 and 8 : "+ (6 == 8));
        System.out.println("This is Grether comparison between 6 and 8  : "+ (6 >= 8));
        System.out.println("This is Less comparison between 6 and 8     : "+ (6 <= 8));

        // 4. Logical Operator

        System.out.println();
        System.out.println("This is && comparison between 78 and 99 : "+ (78 < 99 && 99 > 78));
        System.out.println("This is || comparison between 78 and 99 : "+ (78 < 99 || 99 > 78));
        System.out.println("This is && comparison between 78 and 99 : "+ (78 < 99 && 78 > 99));

        // 5. Bitwise Operator

        System.out.println();
        System.out.println("This is betwise & comparison between 5 and 2 : "+ (5&2));
        System.out.println("This is betwise | comparison between 5 and 2 : "+ (5|2));

    }
}