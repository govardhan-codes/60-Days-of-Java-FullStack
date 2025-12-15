import java.util.*;

public class StreamTerminalOps {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Sita", "Govardhan");

        long count = names.stream().count();
        System.out.println("Total names: " + count);
    }
}
