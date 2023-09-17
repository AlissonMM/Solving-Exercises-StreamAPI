import java.util.Arrays;
import java.util.List;

public class Challenge19 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        List<Integer> threeFive = numbers.stream().filter(n -> n % 3 == 0 && n % 5 == 0).toList();

        Integer sumThreeFive = threeFive.stream().reduce(Integer::sum).orElse(null);

        System.out.println(threeFive);
        System.out.println(sumThreeFive);

    }
}
