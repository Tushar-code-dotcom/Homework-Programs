//program to overload a series

public class frser
{
    public double series(double n)
    {
        int a;
        double s=0;
        for(int i=1;i<=n;i++)
        {
            s=s+1/i;
            
        }
        return s;
    }
     public double series(double a,double n)
       {
        
        double s=0;
        double b=1.00;
        double c=1/a*a;
        s=s+c;
        for(int i=5;i<=n;i+=3)
        {
            s=s+ ((b+3)/Math.pow(a,i));
            
        }
        return s;
    }
    public static void main(String args[])
    {
        frser x=new frser();
        double z=x.series(1.00,2.00);
        System.out.println("sum = "+z);
    }
}