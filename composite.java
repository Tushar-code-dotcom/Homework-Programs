//program to find weather a number is a composite number or not

import java.util.Scanner;

public class composite
{
    int n;
    int count;
    void get()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number taht you want to find weather it is composite or nor ");
        n=a.nextInt();
    }
    void display()
    {
        count=0;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count!=0)
        {
            System.out.println(n+" is a composite number");
        }
        else
        {
            System.out.println(n+" is not a composite number");
        }
    }
    public static void main(String args[])
    {
        composite num=new composite();
        num.get();
        num.display();
    }
}