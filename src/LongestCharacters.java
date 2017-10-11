import java.util.HashMap;

/**
 * Created by codez on 2017/7/4.
 *
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestCharacters {
    public static void main(String args[]) {
        LongestCharacters longestCharacters = new LongestCharacters();
        System.out.print("result:"+longestCharacters.lengthOfLongestSubstring("abccbadaaj"));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int j = 0;//left pointer
        for (int i = 0; i<s.length();i++) { //i:right pointer
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
