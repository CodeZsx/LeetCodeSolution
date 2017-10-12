import java.util.Stack;

/**
 * Created by codez on 2017/10/12.
 *
 * 20. Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {
    public static void main(String args[]) {
        ValidParentheses v = new ValidParentheses();
        System.out.println("result:"+v.isValid("{}{[][()]}"));
    }
    public boolean isValid(String s){
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < s.length(); i ++) {
            String cur = s.substring(i, i + 1);
            if (!stack.isEmpty()) {
                if ((stack.peek().equals("{")&&cur.equals("}"))||
                        (stack.peek().equals("[")&&cur.equals("]"))||
                        (stack.peek().equals("(")&&cur.equals(")")))
                    stack.pop();
                else stack.push(cur);
            }else{
                stack.push(cur);
            }
        }
        return stack.isEmpty();
    }
}
