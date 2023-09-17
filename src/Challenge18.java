import java.util.Arrays;
import java.util.List;

public class Challenge18 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean allEqual = numbers.stream().distinct().limit(2).count() == 1; //distinct deletes duplicates
        //limit will set maxSize to 2, and if count == 1 it means it has only one element, because the others were duplicates
        //int that case all are equals

        System.out.println("Are all the numbers equal? " + allEqual);
    }
}
