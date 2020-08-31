//program to print the multiples of 3 starting from three uptill n terms

import java.util.Scanner;

public class multiples
{
    int n;
    void get()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the nth term till you want the multiple of 3 ex.till 50th term");
        n=a.nextInt();
    }
    void print()
    {
        int z=3;
        System.out.print(z);
        for(int i=1;i<=n;i++)
        {
            z+=3;
            System.out.print(", "+z);
        }
    }
    public static void main(String args[])
    {
        multiples abc=new multiples();
        abc.get();
        abc.print();
    }
}