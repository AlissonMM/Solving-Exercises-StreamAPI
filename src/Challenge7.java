import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Challenge7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer secondLargest = numbers.stream()
                        .distinct() //Delete duplicates
                .sorted(Comparator.reverseOrder()) //Sort in reverse order
                                        .skip(1) //The firs will be the highest, so we skip it
                                                .findFirst()//the first of the list
                                                        .orElse(null); //if the list is empty the variable will be too


        System.out.println(secondLargest);


    }
}
