//program to impose charges to customers based on the number of units to be shipped and special customers

import java.util.Scanner;

public class BHNshipping
{
    double a;
    char z;
    double amt;
    void getdat()
    {
        Scanner ship=new Scanner(System.in);
        System.out.println("enter the number of units to be shipped");
        a=ship.nextDouble();
        
        System.out.println("if special customer enter y or Y if not then enter n or N");
        z=ship.next().charAt(0);
    }
    void calc()
    {
        if(z=='y' || z=='Y')
        {
            if(a<15)
            {
                amt=(a*150)-(a*150*10)/100;
                System.out.println("amt is "+ amt);
            }
            else if(a>=15 && a<=20)
            {
                amt=(a*145)-(a*145*10)/100;
                System.out.println("amt is "+ amt);
            }
            else if(a>=21 && a<=30)
            {
                amt=(a*140)-(a*140*10)/100;
                System.out.println("amt is "+ amt);
            }
            else if(a>=31 && a<=40)
            {
                amt=(a*135)-(a*135*10)/100;
                System.out.println("amt is "+ amt);
            }
            else if(a<50)
            {
                amt=(a*130)-(a*130*10)/100;
                System.out.println("amt is "+ amt);
            }
            else
            {
                System.out.println("Error");
            }
        }
        else
        {
            if(a<15)
            {
                amt=(a*150);
                System.out.println("amt is "+ amt);
            }
            else if(a>=15 && a<=20)
            {
                amt=(a*145);
                System.out.println("amt is "+ amt);
            }
            else if(a>=21 && a<=30)
            {
                amt=(a*140);
                System.out.println("amt is "+ amt);
            }
            else if(a>=31 && a<=40)
            {
                amt=(a*135);
                System.out.println("amt is "+ amt);
            }
            else if(a<50)
            {
                amt=(a*130);
                System.out.println("amt is "+ amt);
            }
            else
            {
                System.out.println("error");
            }
        }
    }
    public static void main(String args[])
    {
        BHNshipping pqr=new BHNshipping();
        pqr.getdat();
        pqr.calc();
    }
}
        
        
           