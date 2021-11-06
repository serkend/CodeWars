package code_wars.maximum_possible_int;


import java.util.ArrayList;
import java.util.List;

class DescendingOrder {
    public static int sortDesc(final int num) {
        int b = num;
        List<Integer> list = new ArrayList<>();
        while (b != 0) {
            list.add(b % 10);
            b /= 10;
        }

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if(list.get(i) < list.get(i + 1)){
                    isSorted = false;

                    buf = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1,buf);
                }
            }
        }

        int res = 0, mult = 1;

        for (int i = list.size() - 1; i >= 0; i--) {
            res += mult * list.get(i);
            mult *= 10;
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(DescendingOrder.sortDesc(231));
    }
}
