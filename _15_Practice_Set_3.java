package com.company;

public class _15_Practice_Set_3
{
    public static void main(String[] args)
    {
        // Question 1 --> Write a Java Program to convert a string into LowerCase.

        String name = "StudEnt47";
        name = name.toLowerCase();

        System.out.println();
        System.out.println("The LowerCase string is : "+ name);

        // Question 2 --> Write a Java Program to Replace a spaces into underscores.

        String name2 = "This is String";
        name2 = name2.replace(" ", "_");

        System.out.println();
        System.out.println("The Replaced string is : "+ name2);

        // Question 3 --> Write a Java Program to fill in a letter template which looks like below :
        // Replace --> letter = "Dear <|name|> , you had a great job ..!.

        String name3 = "Dear <|name|> , you had a great job ..!";
        name3 = name3.replace("<|name|>", "student47");

        System.out.println();
        System.out.println("The Replaced string is : "+ name3);

        // Question 4 --> Write a Java Program to detect Double and tripple spaces in a string.

        String name4 = "This is Double  and triple   spaces in the string";

        System.out.println();
        System.out.println("The Double index : "+ name4.indexOf("  "));
        System.out.println("The Triple index : "+ name4.indexOf("   "));

        // Question 5 --> Write a program to format the following letter using escape sequence characters.

        String name5 = "\n\nDear 47,\n\t You have a new Mail .. \n\t\t\t\t\t\t- Siri";

        System.out.println();
        System.out.print("The formatted string is as follows : ");
        System.out.println(name5);
    }
}