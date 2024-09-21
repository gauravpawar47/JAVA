package com.company;

abstract class _60_Pen
{
    abstract void write();
    abstract void refill();
}

class _60_FountainPen extends _60_Pen
{
    void write()
    {
        System.out.println("Write");
    }
    void refill()
    {
        System.out.println("Refill");
    }
    void changeNib()
    {
        System.out.println("Changing the Nib");
    }
}

class _60_Monkey
{
    void jump()
    {
        System.out.println("Jumping");
    }
    void bite()
    {
        System.out.println("Biting");
    }
}

interface  _60_BasicAnimal
{
    void eat();
    void sleep();
}

class _60_Human extends _60_Monkey implements _60_BasicAnimal
{
    void speak()
    {
        System.out.println("Hello ");
    }
    public void eat()
    {
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }
}

abstract class  _60_TelePhone
{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class _60_SmartTelePhone extends  _60_TelePhone
{
    public void ring()
    {
        System.out.println("Ring");
    }
    public void lift()
    {
        System.out.println("Lift");
    }
    public void disconnect()
    {
        System.out.println("Disconnect");
    }
    public void faceCame()
    {
        System.out.println("Generating faceCam");
    }
}

interface  _60_TVRemote
{
    void onOff();
    void increaseVolume();
    void decreaseVolume();
    void changeChannel();
}

interface _60_SmartTVRemote extends _60_TVRemote
{
    void speakSearch();
    void PlayYoutube();
}

class _60_TV implements _60_SmartTVRemote
{
    public void onOff()
    {
        System.out.println("Switching On Tv");
    }
    public void increaseVolume()
    {
        System.out.println("Increasing Volume");
    }
    public void decreaseVolume()
    {
        System.out.println("Decreasing Volume");
    }
    public void changeChannel()
    {
        System.out.println("Changing Channel");
    }
    public void speakSearch()
    {
        System.out.println("Speak Search On");
    }
    public void PlayYoutube()
    {
        System.out.println("Playing Youtube");
    }
}

public class _60_Practice_Set_11
{
    public static void main(String[] args)
    {
        // Question 1 - Create an Abstract class Pen with methods write() and refill() as abstract methods

        // Done...

        // Question 2 - Use the Pen class from Question 1 to create a concrete class fountainPen with additional method changeNib()

        _60_FountainPen obj1 = new _60_FountainPen();

        System.out.println();
        obj1.changeNib();

        // Question 3 - Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this monkey class and Implements BasicAnimal interface with eat() and sleep() methods

        _60_Human harry = new _60_Human();

        System.out.println();
        harry.sleep();

        // Question 4 - Create a class TelePhone with  ring() , lift() and disconnect() methods as abstract methods create another class SmartTelephone and demonstrate Polymorphism

        _60_SmartTelePhone obj2 = new _60_SmartTelePhone();

        System.out.println();
        obj2.faceCame();

        // Question 5 - Demonstrate polymorphism using Monkey class from Question 3

         _60_Monkey obj3 = new _60_Human();

         System.out.println();
         obj3.jump();
         obj3.bite();
         // obj3.speak(); // --> Cannot use speak method because the reference is monkey which does not have speak method

        _60_BasicAnimal obj4 = new _60_Human();

        System.out.println();
        // obj4.speak(); // --> Throws an error
        obj4.eat();
        obj4.sleep();

        // Question 6 - Create an Interface TVRemote and use it to inherit another Interface SmartTVRemote

        // Done..

        // Question 7 - Create a Class TV which Implements TVRemote interface from Question 6

        _60_TV obj5 = new _60_TV();

        System.out.println();

        obj5.onOff();
        obj5.changeChannel();
        obj5.PlayYoutube();
        obj5.decreaseVolume();
        obj5.increaseVolume();
        obj5.speakSearch();
    }
}