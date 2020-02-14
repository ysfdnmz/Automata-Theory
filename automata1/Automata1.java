
package automata1;

/**
 *
 * @author ysfdnmz
 */
public class Automata1 {

    /**
     * @param args the command line arguments
     */
    
    /*
    if input contains 01 then the node will C and program returns true
    */
    public static void main(String[] args) {
        // TODO code application logic here

        String myinput = "0100";

        System.out.println(foo(myinput));
    }

    public static boolean foo(String str) {
        String flag = "A";
        boolean control = false;

        char myCharAray[] = str.toCharArray();

        for (int i = 0; i < myCharAray.length; i++) {
            if (myCharAray[i] == '0' && flag.equals("A")) {
                flag = "B";
            }
            if (myCharAray[i] == '1' && flag.equals("B")) {
                flag = "C";
            }

        }
        if (flag.equals("C")) {
            control = true;
        }

        return control;
    }

}
