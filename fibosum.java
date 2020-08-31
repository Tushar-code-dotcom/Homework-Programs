//meanu driven program to generate and display fibonacci series uptill n number of terms or find the sum of the digits
//of an integer

import java.util.Scanner;

public class fibosum
{
   int n;
   char choice;
   int y;
   void menu()
   {
       Scanner a=new Scanner(System.in);
       System.out.println("Enter 1 to generate fibonacci series upto n number of terms");
       System.out.println("Enter 2 to find the sum of the digits of the number you want to enter");
       n=a.nextInt();
   }
   void done()
   {
       if(n==1)
       {
       Scanner b=new Scanner(System.in);
       System.out.println("enter n you want the fibonacci series upto");
       int z=b.nextInt();
       int n1=0,n2=1,n3;
       for(int i=1;i<=z;i++)
       {
           n3=n1+n2;
           System.out.println(n3);
           n1=n2;
           n2=n3;
       }
    }
    else if(n==2)
    {
        Scanner c=new Scanner(System.in);
        System.out.println("enter the number you want to find the sum of the digits");
        int x=c.nextInt();
        int sum1=0;
        while(x>0)
        {
            y=y%10;
            sum1=sum1+y;
            x=x/10;
        }
        System.out.println("the sum of the digits is "+sum1);
    }
    else
    {
        System.out.println("error");
    }
    Scanner d=new Scanner(System.in);
    System.out.println("would you like to continue[y/n]");
    choice=(d.next().charAt(0));
}
public static void main(String args[])
{
    fibosum abc=new fibosum();
    abc.menu();
    abc.done();
}
}


       
 