class A {
    final void show() {
        System.out.println("Final Method in A");
    }
}

class B extends A {
    // void show() {} ❌ Error: cannot override final method
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
