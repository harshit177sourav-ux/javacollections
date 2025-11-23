import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaFunction {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 ==0;
        System.out.println(predicate.test(10));
        System.out.println(predicate.test(5));

        Supplier<Integer> supplier = () -> 20;
        System.out.println(supplier.get());

        Function<Integer, Integer> function = x -> x * 3;
        System.out.println(function.apply(40));

        Consumer<Integer> consumer = x -> System.out.println("Hi I'm Consumer and the value is: " + x);
        consumer.accept(30);
    }
}
