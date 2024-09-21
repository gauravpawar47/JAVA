package com.company;
import java.util.Scanner;

class _61_Library
{
    Scanner sc = new Scanner(System.in);

    private String []bookName = {"The C Language" , "C++ Language" , "The Java Language" , "Python" , "Next_Book"};
    private String []bookAuthor = {"Gaurav" , "Manish" , "Durgesh" , "Chinmay" , "Next_Author"};
    private int[]bookSize = {500 , 450 , 400 , 500 , 000};
    private int iterator = bookName.length - 1;

    public void test()
    {
        System.out.println("The iterator is here  : "+ iterator);
    }

    public void showAvailableBook() // Displaying the available books in the library
    {
        for(int i = 0; i < bookName.length; i++)
        {
            System.out.println();
            System.out.println("Name   : "+bookName[i]);
            System.out.println("Author : "+bookAuthor[i]);
            System.out.println("Size   : "+bookSize[i]);
            System.out.println();
        }
    }

    public void addBook() // Add the given book into the Library
    {
        System.out.println();
        System.out.print("Enter the name of the book   : ");
        bookName[iterator] = sc.nextLine();

        System.out.print("Enter the size of the book   : ");
        bookSize[iterator] = sc.nextInt();

        System.out.print("Enter the name of the author : ");
        bookAuthor[iterator] = sc.nextLine();
        bookAuthor[iterator] = sc.nextLine();
        System.out.println();

        iterator++;
    }

    public void issueBook() // Issued the given book to the user
    {
        int index;

        System.out.println();
        System.out.print("Enter the index of the book : ");
        index = sc.nextInt();

        if(index < bookName.length)
        {
            System.out.println();
            System.out.println("Name   : " + bookName[index]);
            System.out.println("Author : " + bookAuthor[index]);
            System.out.println("Size   : " + bookSize[index]);
            bookName[index] = null;
            bookSize[index] = 0;
            bookAuthor[index] = null;
            System.out.println();
        }
        else
        {
            System.out.println("Invalid Index");
        }
    }

    public void returnBook() // To returned the Given Book
    {
        addBook();
    }
}

public class _61_Exercise_4_4_Solution
{
    public static void main(String[] args)
    {
        int input;
        boolean b = true;

        Scanner sc = new Scanner(System.in);

        _51_Library obj1 = new _51_Library();

        while(b)
        {
            System.out.println("Press 0 For Exit\nPress 1 For Show All Books\nPress 2 For Add Book\nPress 3 For Issue Book\n");
            input = sc.nextInt();

            switch (input)
            {
                case 0:
                    return;
                case 1:
                    obj1.showAvailableBook();
                    break;
                case 2:
                    obj1.addBook();
                    break;
                case 3:
                    obj1.issueBook();
                    break;
                default:
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }
    }
}