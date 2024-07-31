import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int original = n; // Store the original number
        int sum = 0;
        int numDigits = String.valueOf(n).length(); // Get the number of digits

        // Calculate the sum of the digits each raised to the power of numDigits
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, numDigits);
            n /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }
}
