package code_wars.perfect_square;

public class square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) == (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        System.out.println(isSquare(5));
    }
}
