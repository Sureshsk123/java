class StringTest1 {
    public static void main(String[] args) {
        String s1 = "I LOVE JAVA";
        
        // Extract substring starting from index 7 to end
        String s2 = s1.substring(7, 9); // 7 is inclusive, 9 is exclusive
        
        // Print the substring
        System.out.println(s2); // Output will be "ov"
    }
}
