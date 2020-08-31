//program to print the series 1,4,7,10 uptill n number of terms

import java.util.Scanner;

public class series1
{
    int n;
    void get()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter n");
        n=a.nextInt();
    }
    void print()
    {
        int z=1;
        System.out.print(z);
        for(int i=1;i<=n;i++)
        {
            z+=3;
            System.out.print(","+z);
        }
    }
    public static void main(String args[])
    {
        series1 abc=new series1();
        abc.get();
        abc.print();
    }
}