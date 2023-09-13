import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Challenge5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> higherThenFive = numbers.stream().filter(n -> n > 5).toList();
        higherThenFive.forEach(System.out::println);

        int gradeAverage = higherThenFive.stream().reduce(0, Integer::sum);

        gradeAverage = gradeAverage / higherThenFive.size();

        System.out.println("Average Grade: " + gradeAverage);
    }
}
