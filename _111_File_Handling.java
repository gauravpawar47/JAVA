package com.company;

import javax.sound.sampled.Line;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _111_File_Handling
{
    public static void main(String[] args)
    {
        // Creating a new File

        File myFile = new File("_111_File_Handling.txt");

        try
        {
            myFile.createNewFile();
        }
        catch(IOException e)
        {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        // Writing to a File

        try
        {
            FileWriter fileWriter = new FileWriter("_111_File_Handling.txt");
            fileWriter.write("This is our first file from the java course\nstudent47");
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        // Reading in a file

        try
        {
            Scanner input = new Scanner(myFile);
            while (input.hasNextLine())
            {
                String line = input.nextLine();
                System.out.println(line);
            }

            input.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        // Deleting a File

        if(myFile.delete())
        {
            System.out.println("I have deleted : "+ myFile.getName());
        }
        else
        {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}