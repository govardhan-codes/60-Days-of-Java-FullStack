# 🚀 Day 14 – JDBC Basics

## 📌 Introduction
JDBC (Java Database Connectivity) is an API that allows Java applications
to communicate with relational databases such as MySQL, Oracle, and PostgreSQL.

---

## 🧠 Topics Covered
- What is JDBC
- JDBC Architecture
- Types of JDBC Drivers
- Steps to connect Java with Database
- Statement & ResultSet
- Exception Handling in JDBC

---

## 🏗 JDBC Architecture
Java Application → JDBC API → JDBC Driver → Database

---

## 🔌 Types of JDBC Drivers
1. Type 1 – JDBC-ODBC Bridge
2. Type 2 – Native API Driver
3. Type 3 – Network Protocol Driver
4. Type 4 – Thin Driver (Most Used)

---

## 🧩 Steps to Connect Java with Database
1. Load Driver
2. Create Connection
3. Create Statement
4. Execute Query
5. Process ResultSet
6. Close Connection

---

## 💻 Sample Program
Refer to `JdbcDemo.java` for a basic JDBC example.

---

## 🧠 Key Takeaways
- JDBC enables database connectivity in Java
- Type 4 driver is widely used
- Proper exception handling is important
- JDBC is the base for Spring JDBC & Hibernate

---

## 📁 Project Structure
Day_14_JDBC_Basics/
├── JdbcDemo.java
├── JdbcArchitecture.txt
└── README.md

---

## 🎯 Next Topic
PreparedStatement & CRUD Operations using JDBC
