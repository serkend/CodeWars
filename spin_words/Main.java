package code_wars.spin_words;

import java.util.Locale;

class PangramChecker {
    public boolean check(String sentence) {
        char ch = 'a';
        sentence = sentence.toLowerCase(Locale.ROOT);
        while (ch != 'z' + 1) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
            ch++;
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new PangramChecker().check("The quick brown fox jumps over the lazy dog."));
    }
}
