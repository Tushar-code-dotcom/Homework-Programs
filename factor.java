//program to find the factor of a given number entered by a user

import java.util.Scanner;

public class factor
{
    int f;
    void get()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number you want the factor of");
        f=a.nextInt();
    }
    void fac()
    {
        System.out.print("Factors of "+f+ " are:");
        for(int i=1;i<=f;i++)
        {
            if(f%i==0)
            {
                System.out.print(i+",");
            }
        }
    }
    public static void main(String args[])
    {
        factor abc=new factor();
        abc.get();
        abc.fac();
    }
}