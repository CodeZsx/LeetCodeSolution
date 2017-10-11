/**
 * Created by codez on 2017/10/11.
 *
 * 14.Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class LongestCommonPrefix {
    public static void main(String args[]) {
        LongestCommonPrefix l = new LongestCommonPrefix();
        String[] strs = {"abcdefg","abcdefghijk","abcdfghijk"};
        String[] test = {"abab", "aba",""};
        System.out.println("result:"+l.longestCommonPrefix(test));
    }
    public String longestCommonPrefix(String[] strs){
        if (strs.length==0) return "";
        String str = strs[0];
        int len = str.length();
        for (int i = 1; i < strs.length; i ++) {
            for (int j = 0; j < len && j < strs[i].length(); j ++){
                if (strs[i].charAt(j)!=str.charAt(j)){
                    len = j;
                    break;
                }
            }
            len = Math.min(len, strs[i].length());
        }
        return str.substring(0, len);
    }
}
