public class SimpleDiamondPattern {
    public static void main(String[] args) {
        int n = 4; // Maximum number in the pattern

        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);  // Print leading spaces
            printNumbers(i);     // Print numbers
        }
        for (int i = n - 1; i >= 1; i--) {
            printSpaces(n - i);  // Print leading spaces
            printNumbers(i);     // Print numbers
        }
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
        }
    }

    private static void printNumbers(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(count + " ");
        }
        System.out.println();
    }
}