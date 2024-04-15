public class classObject
{
    public static void main(String args[])
    {
        Pen elkos = new Pen();
        elkos.write();
        elkos.printColour("Red");

        Student RAHUL = new Student();
        RAHUL.printStudentInfo("Rahul",21,107);
    }
}
class Pen
{
    String colour;
    int price ;

    void write()
    {
        System.out.println("Writing by pen");
    }
    void printColour(String colour)
    {
        this.colour = colour;
        System.out.println(this.colour);
    }
}

class Student
{
    int roll_no=104;
    String name="rohit";
    int age=23;

    void printStudentInfo(String name,int age,int roll_no)
    {
        this.name = name;this.age=age;this.roll_no=roll_no;
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.age);
    }
}
