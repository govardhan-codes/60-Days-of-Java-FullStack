@FunctionalInterface
interface Demo {
    void show();
}

public class LambdaBasic {
    public static void main(String[] args) {

        Demo d = () -> System.out.println("Hello from Lambda Expression");
        d.show();
    }
}
