package Solid_principle.OpenClosed_Principle.WithoutOpenClosedPrinciple;

class Shape
{
    public void draw()
    {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

class Square extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Square");
    }
}

class Triangle extends Shape
{
    public void draw()
    {
        System.out.println("Drawing Triangle");
    }
}

class ShapeDrawer 
{
    public void drawShape(Shape shape) 
    {
        if (shape instanceof Circle) 
        {
            ((Circle) shape).draw();
        } 
        else if (shape instanceof Rectangle) 
        {
            ((Rectangle) shape).draw();
        }
    }
}


public class Main 
{
    public static void main(String[] args) 
    {
        ShapeDrawer sd = new ShapeDrawer();
        sd.drawShape(new Circle());
        sd.drawShape(new Rectangle());
    }
    
}
