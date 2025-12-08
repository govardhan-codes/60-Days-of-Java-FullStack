class Test {

    final int value = 100;

    public static void main(String[] args) {
        Test t = new Test();
        // t.value = 200;  ❌ Error: cannot assign value to final variable

        System.out.println("Final value: " + t.value);
    }
}
