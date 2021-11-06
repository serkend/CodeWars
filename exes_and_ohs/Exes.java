package code_wars.exes_and_ohs;

import java.util.Locale;

public class Exes {

    public static boolean exes(String str) {
        int xCount = 0, oCount = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o') {
                oCount++;
            } else if (str.charAt(i) == 'x') {
                xCount++;
            }
        }
        if ((oCount == xCount) || (oCount == 0 && xCount == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(exes("abc"));
    }
}
