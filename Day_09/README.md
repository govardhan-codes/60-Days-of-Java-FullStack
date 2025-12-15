# 🚀 Day 09 – Java Streams API

Today I learned one of the most powerful features introduced in **Java 8** – the **Streams API**.
Streams help us process collections in a **clean, functional, and readable way**.

---

## 🔹 What is Stream API?
A Stream represents a sequence of elements that supports **functional-style operations** like filtering, mapping, and reducing.

📌 Stream does NOT store data  
📌 It processes data from collections, arrays, or I/O

---

## 🔹 Key Features
- Functional programming style
- Improves readability
- Supports parallel execution
- No modification of original data

---

## 🔹 Stream Operations
Streams work in **3 stages**:

1️⃣ Source  
2️⃣ Intermediate Operations  
3️⃣ Terminal Operations  

---

## 📘 Examples Covered

### ✅ Creating a Stream
```java
list.stream();
