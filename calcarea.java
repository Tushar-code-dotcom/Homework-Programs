//program to calculate the area of diffrent figures by overloading the same function

public class calcarea
{
    static double area(double a,double b,double c)
    {
        double s=a+b+c/2;
        double ans=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the scalene triangle is "+ ans);
        return ans;
    }
    static int area(int a,int b,int h)
    {
        int ans1=(h*(a+b))/2;
        System.out.println("The area of the trapezium is "+ans1);
        return ans1;
    }
    static double area(double d1,double d2)
    {
        double ans2=(d1*d2)/2;
        System.out.println("the area of a rohumbus is "+ ans2);
        return ans2;
    }
    public static void main(String args[])
    {
        double z=area(23.90,34.37);
        System.out.println("Area = " + z);
    }
}