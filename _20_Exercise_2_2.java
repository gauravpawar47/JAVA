package com.company;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class _20_Exercise_2_2
{
    public static void main(String[] args)
    {
        int iterations;
        int choose, random;
        int playerScore = 0;
        int compScore = 0;
        String name;

        Scanner input = new Scanner (System.in);
        Random rand = new Random();

        System.out.println();
        System.out.println("Welcome to rock , papers , scissors game ");
        System.out.println();

        System.out.printf("There are some rules for the game : \n1. The game starts with your turns.\n2. The Rounds its up on to you how many times you want to play the game\n3. The game is between you and computer.\n4. After every round the score is increment by one if any one of you won the round otherwise the socre stable.\n5. Enjoy the Game \n\n");
        System.out.println();

        System.out.print("Enter your Name / Username : ");
        name = input.next();
        System.out.println();

        System.out.print("How many Rounds do you want to play the game : ");
        iterations = input.nextInt();

        for (int i = 1; i <= iterations; i++)
        {
            System.out.println();

            System.out.println(name+" your turns : ");
            System.out.println();

            System.out.println("Choose 1 For Rock");
            System.out.println("Choose 2 For Papers");
            System.out.println("Choose 3 For Scissors");
            System.out.println();

            System.out.print("Enter your input here --> ");
            choose = input.nextInt();

            System.out.println("You choose : "+ choose);

            random = 1 + rand.nextInt(3);

            if(!(choose == 4 || choose > 4))
            {
                System.out.println();
                System.out.println("Computer turns : ");
                System.out.println("Computer choose : " + random);
                System.out.println();
            }

            if(choose == 4 || choose > 4)
            {
                System.out.println();
                System.out.println("Invalid Input");
                return;
            }
            else if(choose == 1 && random == 1)
            {
                System.out.println("Draw");
            }
            else if(choose == 1 && random == 2)
            {
                System.out.println("Computer Won");
                compScore += 1;
            }
            else if(choose == 1 && random == 3)
            {
                System.out.println(name +" Won");
                playerScore +=1;
            }
            else if(choose == 2 && random == 1)
            {
                System.out.println(name +" Won");
                playerScore +=1;
            }
            else if(choose == 2 && random == 2)
            {
                System.out.println("Draw");
            }
            else if(choose == 2 && random == 3)
            {
                System.out.println("Computer Won");
                compScore += 1;
            }
            else if(choose == 3 && random == 1)
            {
                System.out.println("Computer Won");
                compScore += 1;
            }
            else if(choose == 3 && random == 2)
            {
                System.out.println(name +" Won");
                playerScore +=1;
            }
            else if(choose == 3 && random == 3)
            {
                System.out.println("Draw");
            }

            System.out.println();
            System.out.println(name +" Score For round "+ i +" --> "+ playerScore);
            System.out.println("Computer Score For round "+ i +" --> "+ compScore);
        }

        if(playerScore < compScore)
        {
            System.out.println();
            System.out.println("Computer Won");
        }
        else if(playerScore > compScore)
        {
            System.out.println();
            System.out.println(name +" Won");
        }
        else if(playerScore == compScore)
        {
            System.out.println();
            System.out.println("Draw");
        }
    }
}