# Day 11 – SQL Basics (DDL & DML)

This module covers the fundamentals of SQL, focusing on **DDL** and **DML** commands used to manage databases and data.

---

## 📘 DDL – Data Definition Language
Used to define and modify database structures.

### Commands:
- CREATE
- ALTER
- DROP
- TRUNCATE

### Example:
```sql
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);
