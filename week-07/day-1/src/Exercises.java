import java.util.Arrays;
import java.util.List;

public class Exercises {

    public static void main(String[] args) {
        //Exercise 1 - Even numbers
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers.stream().
                filter(x -> x % 2 == 0).
                forEach(System.out::println);

       //Exercise 2 - squared positive numbers
        numbers.stream().
                filter(x -> x > 0).
                filter(x -> () % 2 == 0).
                forEach(System.out::println);
    }
}
