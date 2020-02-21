
package automata2;


public class Question3 {

    public static void main(String[] args) {
        System.out.println(isAccepted("10001"));
    }

    public static boolean isAccepted(String myStr) {

        char myArray[] = myStr.toCharArray();
        int flag = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == '0' && flag == 0) {
                flag++;
                continue;
            }
            if (myArray[i] == '0' && flag == 1) {
                flag++;
                continue;
            }
            if (myArray[i] == '0' && flag == 2) {
                return true;
            }
        }

        return false;
    }

}
