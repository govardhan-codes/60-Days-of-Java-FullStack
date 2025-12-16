import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String name = "Govardhan";
        Optional<String> opt = Optional.ofNullable(name);

        // 1. isPresent()
        if (opt.isPresent()) {
            System.out.println("Value: " + opt.get());
        }

        // 2. orElse()
        String result = opt.orElse("Default Name");
        System.out.println(result);

        // 3. ifPresent()
        opt.ifPresent(n -> System.out.println("Hello " + n));
    }
}
