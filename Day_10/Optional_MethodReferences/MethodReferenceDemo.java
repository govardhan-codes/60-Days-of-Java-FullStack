import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Java", "Spring", "Hibernate");

        // Lambda expression
        names.forEach(name -> System.out.println(name));

        // Method reference
        names.forEach(System.out::println);
    }
}
