package Palindromes;

public class LoopPalindrome {
    /*
    You can iterate through the characters of the string from both ends
    and compare them until you reach the middle of the string.
    If all characters match, it's a palindrome.
     */
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and convert to lowercase
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
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
