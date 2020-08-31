//program to calculate i.e. program for owjefekhge

public class calc
{
    static void add(int a,int b)
    {
        System.out.println((a+b));
    }
    static void sub(int c,int d)
    {
        System.out.println((c-d));
    }
    static void mul(int e,int f)
    {
        System.out.println((e*f));
    }
    static void divide(int g,int h)
    {
        System.out.println((g/h));
    }
    public static void main(String z)
    {
        if(z=="+")
        {
            add(56,84);
        }
        else if(z=="-")
        {
            sub(65,34);
        }
        else if(z=="*")
        {
            mul(34,98);
        }
        else if(z=="/")
        {
            divide(15,3);
        }
        else
        {
            System.out.println("the operator is wrong");
        }
    }
}
        
          