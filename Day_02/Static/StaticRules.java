class Test {

    int a = 10;
    static int b = 20;

    static void display() {
        // System.out.println(a); ❌ Not allowed (non-static cannot be accessed)
        System.out.println(b);   // ✔ Allowed
    }

    public static void main(String[] args) {
        Test.display();
    }
}
