final class Animal {  // cannot be extended
    void sound() {
        System.out.println("Animal sound");
    }
}

// class Dog extends Animal {} ❌ ERROR: final class cannot be inherited

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
