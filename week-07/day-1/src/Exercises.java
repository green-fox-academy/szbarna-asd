import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercises {

    public static void main(String[] args) {
        //Exercise 1 - Even numbers
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().
                filter(x -> x % 2 == 0).
                forEach(System.out::println);

        System.out.println("-------------------------------------------");

       //Exercise 2 - squared positive numbers
        numbers.stream()
                .filter(x -> x > 0)
                .map(x -> x * x)
                .forEach(System.out::println);

        List<Integer> numbers1 = Arrays.asList(3, 9, 2, 8, 6, 5);

        System.out.println("-------------------------------------------");

        List<Integer> squaredNumbersAbove20 = numbers1.stream()
                .map(x -> x * x)
                .filter(x -> x > 20)
                .collect(Collectors.toList());

        squaredNumbersAbove20
                .forEach(System.out::println);
    }
}
