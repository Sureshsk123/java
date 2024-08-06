class sathya {

sathya(int n) {
int sum = 0;
for (int i = 1; i <= n; i++) {
sum += i;
}
System.out.println("sathya's sum of series up to " + n + " is: " + sum);
}

public static void main(String[] args) {
sathya sathya = new sathya(5);
}
}