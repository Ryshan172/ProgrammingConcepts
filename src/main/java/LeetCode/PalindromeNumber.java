package LeetCode;

public class PalindromeNumber {
    /*
    Given an integer x, return true if x is a
    palindrome
    , and false otherwise.



    Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    Example 3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

     */

    public boolean isPalindrome(int x) {

        Integer xNum = x;

        String testString = xNum.toString();

        int left = 0;
        int right = testString.length() - 1;

        while (left < right) {
            if (testString.charAt(left) != testString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

    public boolean isPalindromeAlt(int x) {
        /*
        We first handle the case where the input integer is negative. Negative numbers are not considered palindromes.

        We create a variable reversed to store the reversed integer.

        We iterate through the original integer x, extracting its digits from right to left and building the reversed integer.

        We compare the original integer with the reversed integer to determine if it's a palindrome.
         */

        if (x < 0) {
            return false;
        }

        int originalNum = x;
        int reversedNum = 0;

        while (x > 0) {
            int digit = x % 10;
            reversedNum = reversedNum * 10 + digit;
            x /= 10;


        }

        return originalNum == reversedNum;

    }

}
