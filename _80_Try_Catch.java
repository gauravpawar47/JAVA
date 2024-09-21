package com.company;

public class _80_Try_Catch
{
    public static void main(String[] args)
    {
        int a = 6000;
        int b = 10;

        try
        {
            int c = a / b;
            System.out.println("Result : " + c);
        }
        catch (Exception e)
        {
            System.out.printf("We failed ,Reason : "+ e);
        }
        System.out.println("\nEnd of Program\n");
    }
}