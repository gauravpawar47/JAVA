package com.company;
import java.util.Scanner;

public class _18_Else_If_Ladder_Switch_Case
{
    public static void main(String[] args)
    {
        // If - Else Ladder

        System.out.println();

        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age : ");
        age = input.nextInt();

        if(age > 60)
        {
            System.out.println("You are going to Retired from Your self !!");
        }
        else if(age > 27)
        {
            System.out.println("You are going to get Married !!");
        }
        else if(age > 23)
        {
            System.out.println("You are going to join a Job !!");
        }
        else if (age > 18)
        {
            System.out.println("You are going to become an adult !!");
        }
        else
        {
            System.out.println("Enjoy your Life !!");
        }

        // Switch - Case - ( We can give string , character , ineger value in the switch case but we already much more use / practiced the int and char so just for recap and flashing I've used string hear)

        System.out.println();

        String var;

        System.out.print("Enter your username : ");
        var = input.next();

        switch (var)
        {
            case "student47" :
            {
                System.out.println("Welcome 47");
                break;
            }
            case "Anonymous" :
            {
                System.out.println("This is Anonymous Web");
                break;
            }
            case "gaurav" :
            {
                System.out.println("Hello "+ var);
                break;
            }
            case "2pac" :
            {
                System.out.println("G.O.A.T");
                break;
            }
            default :
            {
                System.out.println("You are under RADAR .. Surrender or Fast");
                break;
            }
        }

        System.out.println();
        System.out.println("*__*");
        System.out.println();
    }
}