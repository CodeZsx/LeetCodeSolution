/**
 * Created by codez on 2017/10/12.
 *
 * 5. Longest Palindromic Substring
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 *
 * Example:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 *
 * Example:
 * Input: "cbbd"
 * Output: "bb"
 */
public class LongestPalindromicSubstring {
    public static void main(String args[]) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        System.out.println("result:"+l.longestPalindrome("babad"));
    }

    private int index;
    private int maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        for (int i = 0; i < s.length()-1; i++) {
            centerPalindrome(s, i, i);//search: cbabc
            centerPalindrome(s, i, i+1);//search: cbbc
        }
        return s.substring(index, index + maxLen);
    }

    public void centerPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;//move left-pointer to the left
            right++;//move right-pointer to the right
        }
        int curMax = right-left-1;
        if (maxLen < curMax) {
            index = left + 1;//save start index
            maxLen = curMax;//save max len
        }
    }
}
