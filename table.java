//program to find the mathematical table of a given or entered number upto the number of tume the user wants

import java.util.Scanner;

public class table
{
    int x;
    int n;
    
    void data()
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter the number you want for whcih you want the mathematical table");
        x=s.nextInt();
        
        System.out.println("enter till which number you want the table for ex- till 10,20 etc etc");
        n=s.nextInt();
    }
    void tab()
    {
        for(int i=1;i<=n;i++)
        {
            int mul=x*i;
            
            System.out.println(mul);
        }
    }
    public static void main(String args[])
    {
        table hem=new table();
        hem.data();
        hem.tab();
    }
}

