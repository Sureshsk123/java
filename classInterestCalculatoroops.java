class InterestCalculator {
public double calculateSimpleInterest(double principal, double rate, double time) {
return (principal * rate * time) / 100;
}
}
public class Main {
public static void main(String[] args) {
if (args.length != 3) {
System.out.println("Usage: java Main <principal> <rate> <time>");
return;
}
double principal = Double.parseDouble(args[0]);
double rate = Double.parseDouble(args[1]);
double time = Double.parseDouble(args[2]);
InterestCalculator calculator = new InterestCalculator();
double interest = calculator.calculateSimpleInterest(principal, rate, time);
System.out.println("Simple Interest: " + interest);
}
}
