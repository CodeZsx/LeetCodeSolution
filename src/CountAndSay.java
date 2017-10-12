/**
 * Created by codez on 2017/10/11.
 *
 * 38. Count and Say
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth term of the count-and-say sequence.
 *
 * Note: Each term of the sequence of integers will be represented as a string.
 */
public class CountAndSay {
    public static void main(String args[]) {
        CountAndSay c = new CountAndSay();
        System.out.println("result:"+c.countAndSay(5));
    }
    public String countAndSay(int n){
        if (n==1) return "1";
        String last = countAndSay(n-1);
        char cur = last.charAt(0);
        int count = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i < last.length();i ++) {
            if (cur == last.charAt(i)) {
                count++;
            }else{
                sb.append(count).append(cur);
                cur = last.charAt(i);
                count = 1;
            }
        }
        sb.append(count).append(cur);
        return sb.toString();
    }
}
