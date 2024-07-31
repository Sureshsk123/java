import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int rem = 0;
        int rev = 0;
        while (n != 0) {
            rem = n % 10;
            rev = rev * 10 + rem; // Correct the order here
            n = n / 10;
        }
        System.out.println("Reversed number: " + rev);
    }
}
