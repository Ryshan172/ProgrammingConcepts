package LeetCode;

public class LongestPalindrome {
    /*
    Given a string s, return the longest
    palindromic

    substring
     in s.

    Example 1:

    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.
    Example 2:

    Input: s = "cbbd"
    Output: "bb"
     */

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                String substring = s.substring(i,j);
                if (isPalindrome(substring) && j - i  > end - start ) {
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start,end);
    }


    private boolean isPalindrome (String string) {

        //string = string.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = string.length()-1;

        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;

    }

}
