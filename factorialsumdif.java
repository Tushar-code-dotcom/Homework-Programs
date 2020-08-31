//progrma to find the output of a series

import java.util.Scanner;

public class factorialsumdif
{
    int n;
    int prod;
    void getdata()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the n number of times");
        n=a.nextInt();
    }
    int fact(int m)
    {
        int prod=1;
        for(int i=1;i<=m;i++)
        {
            prod=prod*i;   
        }
        return prod;
    }
    void computesum()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                sum=sum-fact(2*i);
            }
            else
            {
                sum=sum+fact(2*i);
            }
        }
    }
    public static void main(String args[])
    {
        factorialsumdif z=new factorialsumdif();
        z.getdata();
        z.computesum();
    }
}

   