//program to calculate the discount according to amount in the shoppers bill and display the final result

import java.util.Scanner;

public class Biglifediscount
{
    int a;
    int amt;
    void getdat()
    {
        Scanner ab=new Scanner(System.in);
        System.out.println("Please neter your amount to calculate and display the display your discount accordingly");
        a=ab.nextInt();
    }
    void calc()
    {
        if(a<=5000)
        {
            amt=a-400;
            System.out.println("Net value is "+amt);
        }
        else if(a>5000 && a<=10000)
        {
            amt=a-800;
            System.out.println("Net value is "+amt);
        }
        else if(a>10000 && a<=20000)
        {
            amt=a-1000;
            System.out.println("Net value is "+amt);
        }
        else if(a>20000)
        {
            amt=a-2000;
            System.out.println("Net value is "+amt);
        }
        else
        {
            System.out.println("Invalid amount entered, Happy Shopping!!!!");
        }
    }
    public static void main(String args[])
    {
        Biglifediscount abc=new Biglifediscount();
        abc.getdat();
        abc.calc();
    }
}
    