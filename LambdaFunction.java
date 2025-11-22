import java.util.function.Predicate;

public class LambdaFunction {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 ==0;
        System.out.println(predicate.test(10));
    }
}
