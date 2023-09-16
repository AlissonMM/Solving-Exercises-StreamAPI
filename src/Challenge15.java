import java.util.Arrays;
import java.util.List;

public class Challenge15 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean anyNegative = numbers.stream().anyMatch(n -> n < 0);

            System.out.println("Any negative? " + anyNegative);
    }
}
