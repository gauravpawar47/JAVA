package com.company;
import java.util.Scanner;

public class _82_Nested_Try_Catch
{
    public static void main(String[] args)
    {
        int []marks = new int[3];
        marks[0] = 44;
        marks[1] = 114;
        marks[2] = 145;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        
        while(flag)
        {
            System.out.print("Enter the index : ");
            int ind = sc.nextInt();

            try
            {
                try
                {
                    System.out.println(marks[ind]);
                    flag = false;
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println(e);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}