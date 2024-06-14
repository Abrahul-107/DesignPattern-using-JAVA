/*Suppose, Student is a class having three methods namely printDetails(), calculatePercentage(), and addStudent(). Hence, 
the Student class has three responsibilities to print the details of students, calculate percentages, and database. 
By using the single responsibility principle, we can separate these functionalities into three separate classes to fulfill 
the goal of the principle.*/

package Solid_principle.SingleResponsibility.WithoutSingleResponsibility;

class Student
{
    int numOfStudent;
    int marks = 545;
    int totalMarks = 600;
    String name = "Rahul";
    String Rollno = "22MCA107";

    public void printDetails() {
        System.out.printf("Name is %s%n", name);
        System.out.printf("Roll no is %s%n", Rollno);
    }
    
    public void calculatePercentage() {
        float percentage = ((float) marks / totalMarks) * 100;
        System.out.printf("Total percentage of %s is %.2f%%%n", name, percentage);
    }
    
    public void addStudent() {
        numOfStudent += 1;
        System.out.printf("Total number of students is %d%n", numOfStudent);
    }
    

}

class Main
{
    public static void main(String[] args) 
    {
        Student s = new Student();
        s.printDetails();
        s.calculatePercentage();
        s.addStudent();
        
    }
}