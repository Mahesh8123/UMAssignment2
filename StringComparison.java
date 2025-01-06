public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // A. Using "==" method
        System.out.println(str1 == str2); // true

        // B. Using "equals" method
        System.out.println(str1.equals(str3)); // true

        // C. Using "compareTo" method
        System.out.println(str1.compareTo(str2)); // 0
    }
}
