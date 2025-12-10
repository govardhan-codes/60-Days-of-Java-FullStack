package AccessModifiers;

public class MainAccess {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        System.out.println("Access inside same class A:");
        objA.show();

        System.out.println("\nAccess inside subclass B:");
        objB.display();
    }
}
