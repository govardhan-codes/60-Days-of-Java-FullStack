import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer, String> courses = new HashMap<>();

        courses.put(101, "Java");
        courses.put(102, "Spring Boot");
        courses.put(103, "MySQL");

        System.out.println("HashMap Elements:");
        System.out.println(courses);

        System.out.println("\nGet value using key 102:");
        System.out.println(courses.get(102));
    }
}
