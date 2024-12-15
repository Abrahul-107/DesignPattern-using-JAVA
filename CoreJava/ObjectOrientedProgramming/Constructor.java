package CoreJava.ObjectOrientedProgramming;

public class Constructor 
{
    public static void main(String[] args) 
    {
        Rectangle house = new Rectangle(4,5);
        System.out.println("Area of the house is : "+house.Area());
        Rectangle defaultHouse = new Rectangle();
        System.out.println("Area of house without parameter is "+defaultHouse.Area());
    }
}
class Rectangle
{
    private int length ;
    private int breadth ;

    public Rectangle()
    {
        length = 1;
        breadth = 2;

    }

    Rectangle(int l,int b)
    {
        this.length = l;
        this.breadth = b;

    }
    public int Area()
    {
        return length*breadth;
    }
}