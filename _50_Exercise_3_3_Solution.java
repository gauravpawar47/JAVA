package com.company;
import java.util.Random;
import java.util.Scanner;

class _50_Game
{
    public int guessedNumber;
    public int inputNumber;
    public int noOfGuesses = 0;

    _50_Game()
    {
        Random random = new Random();
        this.guessedNumber = 1 + random.nextInt(5);
    }

    void takeUserInput()
    {
        System.out.print("Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    boolean isCorrectNumber()
    {
        noOfGuesses++;

        if(inputNumber == guessedNumber)
        {
            System.out.printf("Yes you guessed it right , it was %d\nYou guessed it in %d attempts\n", guessedNumber, noOfGuesses);
            return true;
        }
        else if(inputNumber < guessedNumber)
        {
            System.out.println("Too Low ...\n");
        }
        else if(inputNumber > guessedNumber)
        {
            System.out.println("Too High ...\n");
        }

        return false;
    }

    public int getGuessedNumber()
    {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses)
    {
        this.noOfGuesses = noOfGuesses;
    }
}

public class _50_Exercise_3_3_Solution
{
    public static void main(String[] args)
    {
        _50_Game g = new _50_Game();
        boolean b = false;

        while(!(b))
        {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}