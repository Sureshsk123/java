class SimpleInterestCalculator {
    
    private double principal;
    private double rate;
    private double time;

    public SimpleInterestCalculator(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }
}

public class Main {
    public static void main(String[] args) {
        
        SimpleInterestCalculator calculator = new SimpleInterestCalculator(1000, 5, 3);

        double interest = calculator.calculateInterest();
        System.out.println("The simple interest is: " + interest);
    }
}
