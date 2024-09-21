package com.company;

class _103_InvalidInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Cannot add 8 and 9";
    }
}

class _103_MaxInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Input Cant be Greater than 100000";
    }
}

class _103_CannotDivideByZeroException extends Exception
{
    @Override
    public String toString()
    {
        return "Cannot divide by 0";
    }
}

class _103_MaxMultiplyInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Input Cant be Greater than 7000 while Multiplying";
    }
}

class _103_CustomCalculator
{
    double add(double a, double b) throws _103_InvalidInputException , _103_MaxInputException
    {
        if(a > 100000 || b > 100000)
        {
            throw new _103_MaxInputException();
        }
        if(a == 8 || b == 9)
        {
            throw new _103_InvalidInputException();
        }
        return a + b;
    }

    double subtract(double a , double b)throws _103_MaxInputException
    {
        if(a > 100000 || b > 100000)
        {
            throw new _103_MaxInputException();
        }
        return a - b;
    }

    double multiply(double a , double b) throws _103_MaxInputException , _103_MaxMultiplyInputException
    {
        if(a > 100000 || b > 100000)
        {
            throw new _103_MaxInputException();
        }
        else if(a > 7000 || b > 7000)
        {
            throw  new _103_MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(double a , double b)throws _103_CannotDivideByZeroException , _103_MaxInputException
    {
        if(a > 100000 || b > 100000)
        {
            throw new _103_MaxInputException();
        }
        if(a == 0 || b == 0)
        {
            throw  new _103_CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class _103_Exercise_6_6_Solution
{
    public static void main(String[] args) throws _103_InvalidInputException, _103_CannotDivideByZeroException,
            _103_MaxInputException, _103_MaxMultiplyInputException
    {
        _103_CustomCalculator c = new _103_CustomCalculator();

        System.out.println(c.add(99 , 1));
        System.out.println(c.subtract(101 , 1));
        System.out.println(c.multiply(10 , 10));
        System.out.println(c.divide(1000 , 10));
    }
}