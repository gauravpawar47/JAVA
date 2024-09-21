package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _00_FileHandling
{
    public static void display()
    {
        Scanner sc = new Scanner(System.in);
        File file = new File("E:\\student47\\Programming\\Java\\Tutorials\\Details.txt");
        try {
            sc = new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                if(line == null)
                    continue;
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        int i, iterator = 0;
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many customers you want to add : ");
        i = sc.nextInt();

        int age[] = new int[i];
        String name[] = new String[i];
        char gender[] = new char[i];

        while(iterator != i)
        {
            System.out.print("\nEnter the Name of customer : ");
            name[iterator] = sc.next();

            System.out.print("Enter the Gender of customer : ");
            gender[iterator] = (char) System.in.read();

            System.out.print("Enter the Age of customer : ");
            age[iterator] = sc.nextInt();
            iterator++;
        }

        FileWriter fileWriter = new FileWriter("Details.txt");
        fileWriter.write(" \t\t\t           ----- Customer Details ----- \t\t \n\n"
                + "\t\t Customer Age   Customer Name   Customer Gender   Customer Bill\n");

        for (int j = 0; j < age.length; j++)
        {
            fileWriter.append("\t\t     "+ age[j] +"            " + name[j] +"             "+ gender[j] +"                "+ total  +"\n");
        }

        System.out.println("Gender is : "+ gender[0]);

        if(iterator == i)
            System.out.println(iterator +" customers has been added");
        else
            throw new IOException("Something wrong here ..");

        fileWriter.close();
        System.out.print("\nWant to see customers .. ?\nYes\\No : ");
        String choice = sc.next();

        if(choice.equalsIgnoreCase("Yes"))
            _00_FileHandling.display();
        else if(choice == "No")
            System.out.println("As you wish");
        else
            System.out.println("Invalid Input..");
    }
}