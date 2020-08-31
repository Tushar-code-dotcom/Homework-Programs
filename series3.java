//program to print the sqaure of 10 natural number but will stop then and there if it 
//divisble by 2,3 or 4

public class series3
{
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            int a=i*i;
            if(a%2==0)
            {
                break;
            }
            else if(a%3==0)
            {
                break;
            }
            else if(a%4==0)
            {
                break;
            }
            else
            {
            System.out.println(a);
        }
    }
}
}
            
            
                