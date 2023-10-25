package Palindromes;

public class StringBuilderPalindrome {
    /*
    You can reverse the string using a StringBuilder and compare it with the original string.
     */
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        if (isPalindrome(input)) {
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}
