//program to find the factorial of a number

import java.util.Scanner;

public class factorial
{
    int x;
    void get()
    {
        Scanner a=new Scanner(System.in);
        
        System.out.println("Enter the number you want to find the factorial of");
        x=a.nextInt();
    }
    void fact()
    {
        int prod=1;
        for(int i=1;i<=x;i++)
        {
            prod=prod*i;
        }
        System.out.println("the factorial of the number is "+ prod);
    }
    public static void main(String args[])
    {
        factorial z=new factorial();
        z.get();
        z.fact();
    }
}

            