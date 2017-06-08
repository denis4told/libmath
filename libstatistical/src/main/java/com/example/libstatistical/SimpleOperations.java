package com.example.libstatistical;

/**
 * Created by drodriguez on 6/6/2017.
 */

public class SimpleOperations {
    public SimpleOperations() {
    }
    public  int add(int a, int b)
    {
        return  a + b;
    }
    public int diff(int a, int b)
    {
        return a - b;
    }
    public int mult(int a, int b)
    {
        return a*b;
    }
    public int div(int a, int b)
    {
        return ((b == 0)? 0 : (a / b));
    }
    public double power(int a, int b)
    {
        return Math.pow(a,b);
    }
    public double scuareRoot(int a)
    {
        return Math.sqrt(a);
    }
}
