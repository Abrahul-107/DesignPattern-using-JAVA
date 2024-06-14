package Solid_principle.SingleResponsibility.WithSingleResponsibility;

class Student {
    int marks = 545;
    int totalMarks = 600;
    String name = "Rahul";
    String rollNo = "22MCA107";

    public int getMarks() {
        return marks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }
}

class StudentPrinter {
    public void printDetails(Student student) {
        System.out.printf("Name is %s%n", student.getName());
        System.out.printf("Roll no is %s%n", student.getRollNo());
    }
}

class StudentCalculator {
    public void calculatePercentage(Student student) {
        float percentage = ((float)student.getMarks() / student.getTotalMarks()) * 100;
        System.out.printf("Total percentage of %s is %.2f%%%n", student.getName(), percentage);
    }
}

class StudentDatabase {
    private int numOfStudent = 1;

    public void addStudent() {
        numOfStudent += 1;
        System.out.printf("Total number of students is %d%n", numOfStudent);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        StudentPrinter printer = new StudentPrinter();
        StudentCalculator calculator = new StudentCalculator();
        StudentDatabase database = new StudentDatabase();

        printer.printDetails(s);
        calculator.calculatePercentage(s);
        database.addStudent();
    }
}
