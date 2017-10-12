/**
 * Created by codez on 2017/10/12.
 *
 * 8. String to Integer (atoi)
 *
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * '  123' -> 123
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * '  -123 ' -> -123
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * '  -123I23' -> -123;'' -> 0
 * If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 * '2200000000'(>2147483647) -> 2147483647;'-2200000000'(<-2147483648) -> -2147483648
 */
public class StringToInteger {
    public static void main(String args[]) {
        StringToInteger s = new StringToInteger();
        System.out.println("result:"+s.myAtoi("+-2"));
    }

    public int myAtoi(String str) {
        if (str.length()==0) {
            return 0;
        }
        int index = 0;
        int flag = 1;
        int sum = 0;
        while (str.charAt(index) == ' '
                && index < str.length()) {
            index++;
        }
        if (str.charAt(index)=='-'){
            flag = -1;
            index++;
        }else if(str.charAt(index)=='+'){
            index++;
        }
        while (index < str.length()) {
            int cur = str.charAt(index) - '0';
            if (cur < 0 || cur > 9) {
                break;
            }
            if (sum > Integer.MAX_VALUE / 10 ||
                    sum == Integer.MAX_VALUE / 10 && cur > Integer.MAX_VALUE % 10) {
                return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            sum = sum * 10 + cur;
            index++;
        }
        return sum * flag;
    }
}
