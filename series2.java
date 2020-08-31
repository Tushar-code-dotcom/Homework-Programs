//program to print the series 4n+1 upto n number of terms 
//5,9,13,17,..................n

import java.util.Scanner;

public class series2
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
        int b=5;
        System.out.print(b);
        for(int i=1;i<=n;i++)
        {
            b+=4;
            System.out.print(", "+b);
        }
    }
    public static void main(String args[])
    {
        series2 abc=new series2();
        abc.get();
        abc.print();
    }
}
