package code_wars.ObjectOriented.PaginationHelper;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

           if(helper.pageIndex(-10) == -1) {
                System.out.println("true");
            }



    }
}
