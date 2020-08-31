//program to implement a book class that stores the details of a book such as its code, title and price 

public class book
{
    book(String name)
    {
        name="harry potter and the philosophers stone";
        System.out.print("the name of the book is "+name);
    }
    public void code(long c)
    {
        c=57629363;
        System.out.print("book code is "+c);
    }
    public void price(int p)
    {
        p=350;
        System.out.println("price of the book is "+p);
    }
    
    public static void main(String args[])
    {
        book p;
        p=new book("Wizarding mysteries");
        p.code(363786386);
        p.price(786);
        
        
        book q;
        q=new book("learn java");
        q.code(6736473);
        q.price(675);
    }
}
        
      