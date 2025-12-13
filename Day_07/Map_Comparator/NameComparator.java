import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    // Custom sorting based on name
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
