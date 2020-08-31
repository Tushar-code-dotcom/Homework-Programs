//program to find the reverse of a number using scanner class

import java.util.Scanner;

public class reverse
{
    int num;
    void get()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number you want the reverse of");
        num=a.nextInt();
    }
    void computerev()
    {
        int n=num;
        int digit=-1;
        int rev=0;
        while(n!=0)
        {
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println("The reverse of the number is "+rev);
    }
    public static void main(String args[])
    {
        reverse z=new reverse();
        z.get();
        z.computerev();
    }
}