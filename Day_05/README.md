Day 05 — Exception Handling in Java

This repository contains Java examples demonstrating various Exception Handling concepts.

## 📘 Topics Covered
- What is an Exception?
- Checked vs Unchecked Exceptions
- try-catch-finally
- throw & throws
- Custom Exceptions
- Try-with-resources

---

## 📁 Folder Structure

Day05-ExceptionHandling/
│
├── src/
│ └── day05/
│ ├── ExceptionHandlingDemo.java
│ ├── UnderAgeException.java
│ └── UncheckedExample.java
│
└── README.md

yaml
Copy code

---

## 🧪 How to Run

javac -d out src/day05/*.java
java -cp out day05.ExceptionHandlingDemo

yaml
Copy code

---

## 📝 Sample Output

=== Basic try-catch ===
Caught ArithmeticException: / by zero

=== Multiple catch blocks ===
Null Pointer Exception
Finally block executed

=== throw & throws ===
Handled IOException: Demo IOException thrown

=== Try-with-resources ===
File error: sample.txt (No such file)

=== Custom Exception ===
Custom Exception Caught: Age must be 18 or older

yaml
Copy code

---

## 🚀 Summary
- Exceptions allow safe error handling.
- `try-catch` prevents program crashes.
- `finally` ALWAYS executes.
- `throw` creates an exception.
- `throws` informs the caller.
- Custom exceptions make error messages meaningful.

---

Happy Coding! 🚀
