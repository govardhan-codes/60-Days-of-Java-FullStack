import java.util.List;

public class LambdaWithCollections {
    public static void main(String[] args) {

        List<String> list = List.of("Java", "Python", "C");

        list.forEach(s -> System.out.println(s));
    }
}
