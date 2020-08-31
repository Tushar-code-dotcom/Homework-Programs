//a menu driven program to calculate the area of diffrent figures

import java.util.Scanner;

public class menu_area
{
    int n;
    double area;
    char choice;
    void get()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter 1 to find the area of circle");
        System.out.println("enter 2 to find the area of a square");
        System.out.println("enter 3 to find the area of a rectangle");
        n=a.nextInt();
    }
    void calc()
    {
        if(n==1)
        {
            Scanner p=new Scanner(System.in);
            System.out.println("enter the radius of the circle to find the area");
            double r=p.nextDouble();
            area=3.14*r*r;
            System.out.println("the area of the circle is "+area);
        }
        else if(n==2)
        {
            Scanner q=new Scanner(System.in);
            System.out.println("enter the side to find the area of the square ");
            double side=q.nextDouble();
            area=side*side;
            System.out.println("the area of the square is "+area);
        }
        else if(n==3)
        {
            Scanner r=new Scanner(System.in);
            System.out.println("enter length");
            double l=r.nextDouble();
            System.out.println("enter breath");
            double b=r.nextDouble();
            area=l*b;
            System.out.println("The area of the rectangle is "+area);
        }
        else
        {
            System.out.println("error");
        }
        Scanner s=new Scanner(System.in);
        System.out.println("Would you like to continue[y/n]");
        choice=(s.next().charAt(0));
        if(choice=='y')
        {
            get();
            calc();
        }
        else
        {
            return;
        }
            
    }
    public static void main(String args[])
    {
        menu_area den=new menu_area();
        den.get();
        den.calc();
    }
}
    
