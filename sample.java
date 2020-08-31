//program of temporary instance

public class sample
{
    int i,j;
    sample(int a,int b)
    {
        a=i;
        b=j;
    }
    public void print()
    {
        System.out.println(i+","+j);
    }
    public static void main(String args[])
    {
        sample s1=new sample(2,5);
        s1.print();
        new sample(8,4).print();
    }
}