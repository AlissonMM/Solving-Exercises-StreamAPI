import java.util.Arrays;
import java.util.List;

public class Challenge6 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean higherThan10 = numbers.stream().anyMatch(n -> n > 10);

        System.out.println("Is there any number in the list higher than 10? " + higherThan10);
    }
}
