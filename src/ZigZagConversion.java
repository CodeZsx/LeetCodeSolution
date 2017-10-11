/**
 * Created by codez on 2017/10/11.
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:

 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {
    public static void main(String args[]) {
        ZigZagConversion z = new ZigZagConversion();
        System.out.println("result:"+z.convert("PAYPALISHIRING", 3));
    }
    public String convert(String s, int numRows){
        StringBuffer[] str = new StringBuffer[numRows];
        for (int i = 0; i < str.length; i++) {
            str[i] = new StringBuffer();
        }
        int i = 0;
        int len = s.length();
        while (i < len) {
            for (int index = 0; index < numRows && i < len;index++) {
                str[index].append(s.charAt(i++));
            }
            for (int index = numRows - 2; index > 0 && i < len; index--) {
                str[index].append(s.charAt(i++));
            }
        }
        for (int index = 1; index < str.length;index++) {
            str[0].append(str[index]);
        }
        return str[0].toString();
    }

}
