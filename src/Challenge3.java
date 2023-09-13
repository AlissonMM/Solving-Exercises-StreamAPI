import java.util.Arrays;
import java.util.List;

public class Challenge3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //allMatch to verify if all the elements match the Predicate
        boolean allPositive = numbers.stream().allMatch(n -> n > 0);

        System.out.println(allPositive);

    }
}
