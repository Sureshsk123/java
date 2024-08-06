class Student {
    private int regNumber;
    private String name;
    private double marks;
    
    public Student(int regNumber, String name, double marks) {
        this.regNumber = regNumber;
        this.name = name;
        this.marks = marks;
    }
    
    public void printDetails() {
        System.out.println("Register Number: " + regNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(12345, "John Doe", 85.5);
        student.printDetails();
    }
}
