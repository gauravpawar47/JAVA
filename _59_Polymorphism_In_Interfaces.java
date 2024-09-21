package com.company;

interface _59_MyCamera
{
    void takeSnap();
    void recordVideo();

    default void record4kVideo()
    {
        System.out.println("Recording in 4k");
    }
}

interface _59_MyWifi
{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class _59_MyCellPhone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting ...");
    }
}

class _59_MySmartPhone extends _59_MyCellPhone implements _59_MyWifi , _59_MyCamera
{
    public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("Recording 2k Video...");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting list of Networks");
        String[] networkList = {"Gaurav", "Manish" , "Chinmay"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {}
    public void connectToNetworks(String network)
    {
        System.out.println("Connecting to "+ network);
    }
    public void simpleMeth()
    {
        System.out.println("I'm a SimpleMeth");
    }
}

public class _59_Polymorphism_In_Interfaces
{
    public static void main(String[] args)
    {
        _59_MyCamera cam1 = new _59_MySmartPhone(); // This is a smartPhone but , we can use it as a camera
        // cam1.getNetworks(); // --> Not allowed
        // cam1.simpleMeth(); // --> not allowed

        // if we are declaring objects of Interface but creating through it Class then we can only access the functions which we have declared in teh interface..

        cam1.record4kVideo();

        _59_MySmartPhone s = new _59_MySmartPhone();

        s.simpleMeth();
        s.recordVideo();
        s.getNetworks();
        s.callNumber(555);
    }
}