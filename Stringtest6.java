import java.util.Scanner;

class Authentication {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the first string:");
 String firstString = scanner.nextLine();
 System.out.print("Enter the second string:");
 String secondString = scanner.nextLine();
if (firstString.equals(secondString)) {
System.out.println("Authenticated");
} else { System.out.println("Non Authenticated");
        }scanner.close();
    }
}
