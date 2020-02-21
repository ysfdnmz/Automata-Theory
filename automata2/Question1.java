
package automata2;


public class Question1 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isAccepted("abab"));
    }

    public static boolean isAccepted(String input) {

        char myArray[] = input.toCharArray();
        boolean myflag = false;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 98 || myArray[i] < 97) {
                System.out.println("Alfabe hatası");
                return false;
            }
        }

        if (myArray.length < 2) {
            return false;
        }

        if (myArray[0] == 'a') {
            myflag = true;
        }

        if (myArray[1] == 'b' && myflag) {
            return true;
        }

        return false;
    }

}
