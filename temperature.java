//program to implement a temperature class that stores temperature in farenheit and converts it into celsius

public class temperature
{
    double temp;
    temperature()
    {
        temp=92;
    }
    temperature(double t)
    {
        temp=t;
    }
    double convert2celsius()
    {
        double cel=(5.0/9)*(temp-32);
        return cel;
    }
    public double gettemp()
    {
        return temp;
    }
    public static void main()
    {
        temperature daytemp=new temperature(94);
        System.out.println("Temperature in farenheit is: "+daytemp.gettemp());
        System.out.println("Temperature in celsius is: "+daytemp.convert2celsius());
        temperature dtemp=new temperature();
        System.out.println("Other temperature in farenheit is: "+dtemp.gettemp());
        System.out.println("other temperature in celsius is: "+dtemp.convert2celsius());
    }
}