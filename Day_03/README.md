# Day 03 – Abstraction vs Interface in Java

This project demonstrates the difference between **Abstraction** (using abstract classes) and **Interfaces** in Java, along with simple, practical examples.

## Topics Covered

- Abstraction using `abstract` classes
- Interfaces and multiple inheritance of type
- Method overriding
- Common behavior vs contract-based design
- When to use abstract class vs interface

---

## 1. Abstraction with Abstract Class

File: `AbstractionDemo.java`

### Classes

- `Payment` (abstract class)
  - Has both:
    - Abstract method: `void pay(double amount)`
    - Concrete method: `void printReceipt(double amount)`
  - Holds common data: `customerName`

- `CardPayment` (extends `Payment`)
- `UpiPaymentAbstract` (extends `Payment`)

### Idea

- `Payment` defines **what must be done** (`pay`) and **how some things are commonly done** (`printReceipt`).
- Subclasses provide specific implementations for different payment types.

---

## 2. Abstraction with Interface

File: `InterfaceDemo.java`

### Interfaces

- `UpiPayment`
  - Methods:
    - `void pay(double amount);`
    - `String getUpiId();`

- `Rewardable`
  - Methods:
    - `int getRewardPoints(double amount);`

### Implementations

- `PhonePe` implements `UpiPayment`, `Rewardable`
- `GooglePay` implements `UpiPayment`

### Idea

- Interfaces define **only the contract** (what methods a class must implement).
- Classes can implement multiple interfaces, achieving **multiple inheritance of type**.

---

## 3. Demo Class

File: `AbstractionVsInterfaceMain.java`

- Creates objects of:
  - `CardPayment`
  - `UpiPaymentAbstract`
  - `PhonePe`
  - `GooglePay`
- Demonstrates:
  - Using abstract classes via parent reference `Payment`
  - Using interfaces via interface references `UpiPayment` and `Rewardable`
  - How the same concept (payment) is modeled differently with abstract classes and interfaces.

---

## Abstraction vs Interface – Quick Comparison

| Feature                     | Abstract Class                                   | Interface                                      |
|----------------------------|--------------------------------------------------|------------------------------------------------|
| Usage                      | "Is-a" relationship with shared base behavior   | Defines a contract (what a class must do)      |
| Methods                    | Can have abstract and concrete methods          | Before Java 8: only abstract methods           |
| State (fields)             | Can have instance variables                     | Fields are implicitly `public static final`    |
| Constructors               | Can have constructors                           | Cannot have constructors                       |
| Multiple inheritance       | Not allowed (only one parent class)            | A class can implement multiple interfaces      |
| When to use                | When you need shared code + some abstract parts | When you need only a contract, no shared state |

---

## How to Run

1. Compile all Java files:

```bash
javac AbstractionDemo.java InterfaceDemo.java AbstractionVsInterfaceMain.java
