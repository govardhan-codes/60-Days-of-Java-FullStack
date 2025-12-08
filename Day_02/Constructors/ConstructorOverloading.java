class Demo {

    Demo() {
        System.out.println("Default Constructor");
    }

    Demo(int a) {
        System.out.println("Parameterized: " + a);
    }

    Demo(int a, String b) {
        System.out.println("Parameterized: " + a + ", " + b);
    }

    public static void main(String[] args) {
        new Demo();
        new Demo(10);
        new Demo(20, "Java");
    }
}
