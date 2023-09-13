import java.util.Arrays;
import java.util.List;

public class Challenge2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();

        evenNumbers.forEach(System.out::println);

        Integer sumEvenNumbers = evenNumbers.stream().reduce(0, Integer::sum);

        System.out.println("The sum of the even numbers is: " + sumEvenNumbers);
    }
}
