import java.util.Scanner;

public class ArrayTest1 {
public static void main(String[] args) {
int a[] = new int[10];
Scanner sc = new Scanner(System.in);

System.out.println("Enter the array values:");
for (int i = 0; i < a.length; i++) {
a[i] = sc.nextInt();
}

System.out.print("The array values are: ");
for (int i = 0; i < a.length; i++) {
System.out.print(a[i] + " ");
}
}
}
