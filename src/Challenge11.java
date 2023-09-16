import java.util.Arrays;
import java.util.List;

public class Challenge11 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int sumSquares = numbers.stream().reduce(0, (integer, integer2) -> integer + integer2 * integer2);

        System.out.println(sumSquares);
    }
}
