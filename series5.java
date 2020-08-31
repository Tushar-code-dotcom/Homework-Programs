//program to print the series 5n+2 but skips then number if it is the multiple of 3
//7,12,17........................ utp n number of terms

import java.util.Scanner;

public class series5
{
    int n;
    void get()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number of terms you want the series till");
        n=a.nextInt();
    }
    void print()
    {
        int x=7;
        System.out.print(x);
        for(int i=1;i<=n;i++)
        {
            x+=5;
            if(x%3==0)
            {
                System.out.print("");
            }
            else
            {
                System.out.print(", "+x);
            }
        }
    }
    public static void main(String args[])
    {
        series5 abc=new series5();
        abc.get();
        abc.print();
    }
}