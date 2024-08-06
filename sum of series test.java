class derick {

    derick(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("derick's sum of series up to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        derick derick = new derick(5);
    }
}