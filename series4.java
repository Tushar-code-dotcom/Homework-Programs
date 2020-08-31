//program to print 2 raise to n but stops as soon as it exceeds 100

import java.util.Scanner;

public class series4
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
        
        for(int i=1;i<=10;i++)
        {
            double x=Math.pow(2,i);
            if(x>100)
            {
                break;
            }
            else
            {
                System.out.print(", "+x);
            }
        }
    }
    public static void main(String args[])
    {
        series4 abc=new series4();
        abc.get();
        abc.print();
    }
}
               
            
        
        