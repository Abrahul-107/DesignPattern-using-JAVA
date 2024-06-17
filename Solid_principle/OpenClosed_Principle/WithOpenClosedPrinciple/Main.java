package Solid_principle.OpenClosed_Principle.WithOpenClosedPrinciple;

//the module should be open for extension but closed for modification
abstract class Shape
{
    public abstract void draw();
}

class Rectangle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing Circle");
    }
}

class ShapeDrawer
{
    public void drawShape(Shape shape)
    {
        shape.draw();
    }
}

class Main
{
    public static void main(String[] args) 
    {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.drawShape(new Circle());
        drawer.drawShape(new Rectangle());

        // Adding a new shape is easy and does not require modifying ShapeDrawer
        Shape triangle = new Shape() 
        {
            @Override
            public void draw() 
            {
                System.out.println("Drawing Triangle");
            }
        };
        drawer.drawShape(triangle);

    }
}