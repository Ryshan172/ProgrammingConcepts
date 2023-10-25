package StringReversal;

public class RecursionReversal {
    /*
     If you need to reverse a string and performance is not a critical concern,
     the third method using recursion is simple and easy to understand.
     However, for efficient reversal, especially in performance-critical applications,
     using a StringBuilder or an in-place reversal with a character array is recommended
     */
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
