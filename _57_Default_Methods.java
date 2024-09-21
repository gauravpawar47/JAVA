package com.company;

interface _57_MyCamera
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("I'm Greet");
    }
    default  void record4kVideo()
    {
        greet();
        System.out.println("Recording in 4k..");
    }
}

interface _57_MyWifi
{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class _57_MyCellPhone
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall()
    {
        System.out.println("Connecting ..");
    }
}

class _57_MySmartPhone extends _57_MyCellPhone implements _57_MyWifi , _57_MyCamera
{
    public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("Taking video");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting list of Networks");
        String []netWorklist = {" Gaurav " , " Chinmay " , " Manish "};
        return netWorklist;
    }

    @Override
    public void connectToNetwork(String network) {}

    public void connectToNetworks(String network)
    {
        System.out.println("Connecting to "+ network);
    }
}

public class _57_Default_Methods
{
    public static void main(String[] args)
    {
        _57_MySmartPhone ms = new _57_MySmartPhone();
        ms.record4kVideo();
        // ms. greet(); --> Throws an error !
        String[] ar = ms.getNetworks();
        for (String item : ar)
        {
            System.out.println("Name :  "+ item);
        }
    }
}