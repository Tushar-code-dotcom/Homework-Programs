//progrma to check weather a number is a perfect sqaure or not

import java.util.Scanner;

public class perfectsquare
{
    double n;
    void get()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter the number you want to check weather it is a perfect square or not");
        n=a.nextDouble();
    }
    void calc()
    {
        if(n%(Math.sqrt(n))==0)
        {
            System.out.println("the number is a perfect square");
        }
        else
        {
            System.out.println("Not a perfect square");
        }
    }
    public static void main(String args[])
    {
        perfectsquare abc=new perfectsquare();
        abc.get();
        abc.calc();
    }
}
