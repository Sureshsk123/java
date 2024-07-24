class Triangle {
    
    private double base;
    private double height;

  
    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        
        Triangle triangle = new Triangle(5, 10);

        
        double area = triangle.calculateArea();
        System.out.println("The area of the triangle is: " + area);
    }
}
