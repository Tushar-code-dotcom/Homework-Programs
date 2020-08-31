//program to overload a series

import java.util.Scanner;

public class series_overload
{
    static double series(double n)
    {
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+1/i;
        }
        return sum;
    }
    static double series(double a,double n)
    {
        int m;
        double sum=0;
        double b=1;
        double c=1/a*a;
        sum=sum+c;
        
        for(int i=5;i<=n;i+=3)
        {
            sum=sum+((b+3)/Math.pow(a,i));
        }
        return sum;
    }
    public static void main(String args[])
    {
        double z=series(5.00);
        System.out.println("the sum is "+z);
    }
}