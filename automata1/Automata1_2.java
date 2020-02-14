
package automata1;

import java.lang.Math;
import java.lang.*;

/**
 *
 * @author ysfdnmz
 */

/*
Count number of binary strings without consecutive 1's
 */
public class Automata1_2 {

    public static void main(String[] args) {
        int myinput = 3;
        System.out.println(bar(myinput));
    }

    public static String bar(int myint) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < Math.pow(2, myint) - 1; i++) {
            String temp = "";

            temp = Integer.toBinaryString(i);

            if (temp.contains("11")) {
                continue;
            }
            sb.append(temp);
            sb.append(","); // need a separator

        }
        String myStr = sb.toString();

        return myStr;

    }
}
