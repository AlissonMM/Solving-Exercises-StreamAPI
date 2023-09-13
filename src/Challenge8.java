import java.util.Arrays;
import java.util.List;

public class Challenge8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 33);

        Integer sumCha  = numbers.stream()
                .flatMapToInt(num -> String.valueOf(num).chars()) // Convert each number to char
                .map(Character::getNumericValue) // get the numeric value of the characters
                .sum(); // sum all the values
        System.out.println(sumCha);
    }
}
