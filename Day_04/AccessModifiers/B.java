package AccessModifiers;

public class B extends A {

    public void display() {
        System.out.println(publicVar);     // Accessible
        System.out.println(protectedVar);  // Accessible
        System.out.println(defaultVar);    // Accessible (same package)
        // System.out.println(privateVar); // ❌ Not accessible
    }
}
