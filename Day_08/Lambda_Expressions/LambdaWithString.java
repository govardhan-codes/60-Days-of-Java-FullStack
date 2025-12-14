@FunctionalInterface
interface JoinString {
    String join(String a, String b);
}

public class LambdaWithString {
    public static void main(String[] args) {

        JoinString js = (a, b) -> {
            return a + " " + b;
        };

        System.out.println(js.join("Java", "Lambda"));
    }
}
