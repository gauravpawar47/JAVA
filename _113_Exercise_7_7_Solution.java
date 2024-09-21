package com.company;
import java.util.ArrayList;

class _113_Book
{
    public String name, author;

    public _113_Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class _113_MyLibrary
{
    public ArrayList<_113_Book> books;

    public _113_MyLibrary(ArrayList<_113_Book> books)
    {
        this.books = books;
    }

    public void addBook(_113_Book book)
    {
        System.out.println("The Book has been added to the Library");
        this.books.add(book);
    }

    public void issueBook(_113_Book book, String issued_to)
    {
        System.out.println("The Book has been issued from the library to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(_113_Book b)
    {
        System.out.println("The Book has been Returned");
        this.books.add(b);
    }
}

public class _113_Exercise_7_7_Solution
{
    public static void main(String[] args)
    {
        ArrayList<_113_Book> bk = new ArrayList<>();
        _113_Book b1 = new _113_Book("Algorithm", "CLRS");
        bk.add(b1);

        _113_Book b2 = new _113_Book("Algorithm2", "CLRS2");
        bk.add(b2);

        _113_Book b3 = new _113_Book("Algorithm3", "CLRS3");
        bk.add(b3);

        _113_Book b4 = new _113_Book("Algorithm4", "CLRS4");
        bk.add(b4);

        _113_MyLibrary l = new _113_MyLibrary(bk);

        l.addBook(new _113_Book("Algo5" , "CLRS5"));
        System.out.println(l.books);

        l.issueBook(b3, "Gaurav");
        System.out.println(l.books);
    }
}