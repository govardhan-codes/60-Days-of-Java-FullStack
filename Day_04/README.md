Day 04 – Encapsulation & Access Modifiers

Today’s learning includes:

🔒 1. Encapsulation

Encapsulation means binding data and methods inside a class and controlling access using private variables, getters, and setters.

✔ Key Points

Variables are kept private

Access is given using public getter/setter methods

It protects data from unauthorized access

📌 Example:

Person class with private fields name, age

Getters and setters to control access

🔐 2. Access Modifiers in Java
Modifier	Same Class	Same Package	Subclass	Different Package
public	✔	✔	✔	✔
protected	✔	✔	✔	❌
default	✔	✔	❌	❌
private	✔	❌	❌	❌
📌 Example Classes:

Class A shows all modifiers

Class B (subclass) accesses only public & protected

MainAccess demonstrates access from outside class

📂 Folder Structure
Encapsulation/
    Person.java
    MainEncapsulation.java

AccessModifiers/
    A.java
    B.java
    MainAccess.java

🚀 What I Learned Today

Why encapsulation is important

How access modifiers protect data

When to use public, private, protected, and default

How subclasses inherit access

How Java restricts access across packages
