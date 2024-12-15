package CoreJava.ObjectOrientedProgramming;
import java.util.*;

public class DataHiding 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length and breadth to your rectangle ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        r.setlength(l);
        r.setbreadth(b);
        sc.close();

        //System.out.println(r.length);
        // r.length = 10; Not visible in java error it means it hiding the data
        // so we can not access or change the data directly
        
        System.out.println(r.area());

    }

}

class Rectangle {
    private int length;
    private int breadth;

    public int getlength() 
    {
        return length;
    }

    public void setlength(int l) 
    {
        if (l > 0)
            length = l;

    }

    public int getbreadth() 
    {
        return breadth;
    }

    public void setbreadth(int b) 
    {
        if (b > 0)
            breadth = b;

    }

    public int area() 
    {
        return length * breadth;
    }

}
