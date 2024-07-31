import java.util.Scanner;

class StringTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < s1.length()) {
            char character = s1.charAt(index);
            System.out.println("Character at index " + index + " in \"" + s1 + "\" is: " + character);
        } else {
            System.out.println("Error: Index out of range. Please enter a valid index.");
        }
        scanner.close();
    }
}
