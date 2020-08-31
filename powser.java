//program t find the sum of a series with increasing power upto ngh

import java.util.Scanner;

public class powser
{
    double x;
    double n;
    
    void get()
    {
        Scanner a=new Scanner(System.in);
        
        System.out.println("enter the constant that is x");
        x=a.nextDouble();
        
        System.out.println("enter the power or the n number of times");
        n=a.nextDouble();
    }
    void total()
    {
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+Math.pow(x,i);
        }
        System.out.println("the sum of the series "+sum);
    }
    public static void main(String args[])
    {
        powser m=new powser();
        m.get();
        m.total();
    }
}