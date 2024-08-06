public class StringRotation {
public static void main(String[] args) {
String inputStr = "abab";
String outputStr = inputStr.substring(1) + inputStr.charAt(0);
System.out.println(outputStr);
}
}
