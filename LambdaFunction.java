import java.util.function.Predicate;

public class LambdaFunction {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 ==0;
    }
}
