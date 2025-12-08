🚀 Day 02 — Constructors, Static, Final (Java Basics)
📘 1. Constructors in Java

A constructor is a special method that runs automatically when an object is created.

✔ Purpose of Constructor

To initialize object values

No return type (not even void)

Name must be the same as class name

🔹 Types of Constructors
1️⃣ Default Constructor

Created automatically if no constructor is written.

class Student {
    Student() {
        System.out.println("Default constructor called");
    }
}

2️⃣ Parameterized Constructor

Accepts values during object creation.

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

3️⃣ Copy Constructor (User-defined)

Copying one object’s data into another.

Student(Student s) {
    this.id = s.id;
    this.name = s.name;
}

🧠 Constructor Overloading

Multiple constructors with different parameters.

class Demo {
    Demo() {}
    Demo(int x) {}
    Demo(int x, String y) {}
}

⚡ 2. static Keyword in Java

The static keyword means belongs to the class, not objects.

You can use static with:

static variable

static method

static block

static class (nested class)

🔹 Static Variable

Shared by all objects.

class Student {
    static String college = "ABC College";
}

🔹 Static Method

No need to create an object.

class Demo {
    static void show() {
        System.out.println("Static method called");
    }
}

Demo.show();

🔹 Static Block

Runs once when class loads.

static {
    System.out.println("Static block executed");
}

⭐ Key Points

Static members are accessed using class name.

Static methods cannot access non-static variables directly.

Static methods cannot be overridden (they are hidden).

🔒 3. final Keyword in Java

The final keyword is used for restriction.

✔ Used with:

final variable → value cannot change

final method → cannot be overridden

final class → cannot be inherited

🔹 final Variable
final int age = 18;
age = 20;   // ❌ Error

🔹 final Method
class A {
    final void show() {}
}
class B extends A {
    void show() {}   // ❌ Error
}

🔹 final Class
final class Animal {}
class Dog extends Animal {}  // ❌ Error
