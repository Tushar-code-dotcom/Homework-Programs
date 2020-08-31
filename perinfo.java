//program using scanner class to enter your name, zodiac sign and lucky number

import java.util.Scanner;

public class perinfo
{
    void data()
    {
        Scanner a=new Scanner(System.in);
        System.out.println("enter your name");
        String name=a.nextLine();
        
        System.out.println("enter zodiac sign");
        String zod=a.nextLine();
        
        System.out.println("enter lucky number");
        String lucky=a.nextLine();
        
        System.out.println("Your name is "+name);
        System.out.println("Your zodiac sign is "+zod);
        System.out.println("Your lucky number is "+lucky);
    }
    public static void main(String args[])
    {
        perinfo xyz=new perinfo();
        xyz.data();
    }
}