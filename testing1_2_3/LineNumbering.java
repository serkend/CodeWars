package code_wars.testing1_2_3;

import java.util.LinkedList;
import java.util.List;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, (i+1) + ": " + lines.get(i));
        }
        return lines;
    }


    public static void main(String[] args) {
        List<String> lines = new LinkedList<>();
        lines.add("Hello ");
        lines.add("world!");
        List<String> lines1 = number(lines);

        for (int i = 0; i < lines1.size(); i++) {
            System.out.println(lines1.get(i));
        }
    }
}
