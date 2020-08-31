//program to overload a method by calculating functions

public class volume
{
    static double vol(double R)
    {
        return 4*22*R*R*R/3*7;
    }
    static double vol(double H,double R)
    {
        return 22*R*R*H/7;
    }
    static double vol(double L,double B,double H)
    {
        return L*B*H;
    }
    public static void main(String args[])
    {
        double x=vol(38.42,89.32);
        System.out.println("The volume is "+x);
    }
}
        