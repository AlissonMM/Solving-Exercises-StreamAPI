import java.util.Arrays;
import java.util.List;

public class Challenge9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean allDistinct =  numbers.stream().allMatch(number -> numbers.stream().filter(n -> n.equals(number)).count() == 1);

        System.out.println("All numbers are distinct? " + allDistinct);
    }
}
