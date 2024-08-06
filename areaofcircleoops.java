class Circle {
double radius;
Circle(double r) {
radius = r;
}
double calculateArea() {
return Math.PI * radius * radius;
}
}
public class Main {
public static void main(String[] args) {
Circle c1 = new Circle(5.0);
System.out.println("Area of circle with radius 5.0: " + c1.calculateArea());
Circle c2 = new Circle(7.5);
System.out.println("Area of circle with radius 7.5: " + c2.calculateArea());
}
}
