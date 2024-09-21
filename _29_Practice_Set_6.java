package com.company;

public class _29_Practice_Set_6
{
    public static void main(String[] args)
    {
        // Question 1 : Create an array of 5 floats and calculate their sum

        float []marks = {50.2f , 70.2f , 92.5f , 65.2f , 45.2f};
        float sum = 0;

        for (float element : marks)
        {
            sum = sum + element;
        }
        System.out.println("\nThe value of sum is : "+ sum);

        // Question 2 : Write a program to find out whether a given integer is present in an array or not

        float[] marks2 = {50.2f, 70.2f, 92.5f, 65.2f, 45.2f};
        float num = 92.5f;
        boolean isInArray = false;

        for (float element : marks2)
        {
            if (num == element)
            {
                isInArray = true;
                break;
            }
        }

        if(isInArray)
        {
            System.out.println("\nThe value is present in the Array");
        }
        else
        {
            System.out.println("\nThe value is not present in the Array");
        }

        // Question 3 : Calculate the average marks from an array containing marks of all students in physics using 'for-each loop'

        float []marks3 = { 50.2f , 70.2f , 92.5f , 65.2f , 45.2f};
        float sum2 = 0;

        for (float element : marks3)
        {
            sum2 = sum2 + element;
        }
        System.out.println("\nThe average marks is : "+ sum2 / marks3.length +"\n");

        // Question 4 : Create a Java Program to add Two Matrix of size 2 X 3

        int [][]mat1 = {{1 , 4 , 6} , {5 , 3 , 9}};
        int [][]mat2 = {{3 , 7 , 2} , {2 , 6 , 1}};
        int [][]result = {{0, 0 , 0} , {0, 0 ,0}};

        for (int i = 0; i < mat1.length ; i++) // Row number of times
        {
            for (int j = 0; j < mat1[i].length; j++) // Column number of times
            {
                System.out.format("Setting value for i = %d and j = %d\n", i , j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of 2-D Array

        System.out.println();
        for (int i = 0; i < mat1.length; i++)
        {
            for (int j = 0; j < mat1[i].length; j++)
            {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(); // Prints a New line
        }

        // Question 5 : Write a Java Program to reverse an Array

        int []arr = { 1 , 5 , 7 , 3 , 0};
        int l = arr.length;
        int n = Math.floorDiv(l , 2);
        int temp;

        for(int i = 0; i < n; i++)
        {
            // Swap arr[i] with arr[l - 1 - i];

            temp = arr[i];
            arr[i] = arr[l - 1 - i];
            arr[l - 1 - i] = temp;
        }

        System.out.printf("\nThe Reversed Array is : ");
        for(int element : arr)
        {
            System.out.print(element +" ");
        }

        // Question 6 : Write a Java Program to find the Maximum element in an Array

        int []arr2 = { 1 , 5 , 7 , 3 , 0};
        int max = Integer.MIN_VALUE;

        for (int e : arr2)
        {
            if(e > max)
            {
                max = e;
            }
        }
        System.out.println("\n\nThe Maximum element in this array is : "+ max);

        // Question 7 : Write a Java Program to find the Minimum element in a Java Array

        int []arr3 = { 1 , 5 , 7 , 3 , 0};
        int min = Integer.MAX_VALUE;
        
        for (int e : arr3)
        {
            if(e < min )
            {
                min = e;
            }
        }
        System.out.println("\nThe Minimum value in this Array is : "+ min);

        // Question 8 : Write a Java Program to find whether an array is Sorted or Not

        int []arr4 = { 1 , 5 , 7 , 3 , 0};
        boolean isSorted = true;

        for (int i = 0; i < arr4.length - 1; i++)
        {
            if(arr4[i] > arr[i +1])
            {
                isSorted = false;
                break;
            }
        }

        if (isSorted)
        {
            System.out.println("\nThe Array is Sorted");
        }
        else
        {
            System.out.println("\nThe Array is Not Sorted");
        }
    }
}