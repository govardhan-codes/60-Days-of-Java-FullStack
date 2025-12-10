package Encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("Govardhan");
        p.setAge(21);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
