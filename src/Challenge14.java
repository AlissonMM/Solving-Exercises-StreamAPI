import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Challenge14 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer largestPrime = numbers.stream()
                .filter(Challenge14::isPrime) // Filtra os números que são primos
                .max(Integer::compareTo) // Encontra o maior entre os números primos
                .orElse(null); // Lidar com o caso de nenhum número primo na lista

        System.out.println(largestPrime);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
