public class Pollymorphism 
{
    public static void main(String[] args) 
    {

        //Runtime pollymorphism
        Shape round = new Circle(5);
        Shape rectangle = new Rectangle(4,5);
        System.out.println(round.area());
        System.out.println(round.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
    
    }
    
}
abstract class Shape
{
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape
{
    private double radius;
    Circle(double radius)
    {
        this.radius = radius;
    }
    @Override
    double area()
    {
        return Math.PI * radius * radius;
    }
    @Override
    double perimeter()
    {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape
{
    private int length;
    private int breadth;

    Rectangle(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double area()
    {
        return length *breadth;
    }
    @Override
    double perimeter()
    {
        return 2 * (length+breadth);
    }

    
}