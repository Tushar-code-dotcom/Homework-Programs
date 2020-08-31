//program to find all the leap years between 2000 and 2040

import java.util.Scanner;

public class leapyear
{
    public static void main(String args[])
    {
        System.out.print("The leap years between 2000 and 2040 is : ");
        for(int i=2000;i<=2040;i+=4)
        {
            System.out.print(i+",");
        }
    }
}