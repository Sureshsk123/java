class derickDivision {
    int quotient, remainder;
    derickDivision() {
        quotient = remainder = 0;
    }
    void divide(int num, int den) {
        if (den != 0) {
            quotient = num / den;
            remainder = num % den;
        } else {
            System.out.println("not  zero.");
        }
    }
    void display() {
        System.out.println("Quotient: " + quotient + "\nremainder: " + remainder);
    }
    public static void main(String[] args) {
        derickDivision div = new derickDivision();
        div.divide(10, 3);
        div.display();
    }
}