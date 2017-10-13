import java.util.ArrayList;
import java.util.List;

/**
 * Created by codez on 2017/10/13.
 *
 * 22. Generate Parentheses22. Generate Parentheses
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */
public class GenerateParentheses {
    public static void main(String args[]) {
        GenerateParentheses g = new GenerateParentheses();
        System.out.println("result:"+g.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        next(list, "", 0, 0, n);
        return list;
    }
    public void next(List<String> list, String s, int left, int right, int n){
        if (s.length() == n * 2) {
            list.add(s);
            return;
        }
        if (left < n) {
            next(list, s+"(", left+1, right, n);
        }
        if (right < left) {
            next(list, s+")", left, right+1, n);
        }
        return;
    }
}
