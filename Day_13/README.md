# 📅 Day 13 – SQL Group By, Having & Subqueries

This day focuses on understanding **data aggregation and advanced querying** in SQL using `GROUP BY`, `HAVING`, and `Subqueries`. These concepts are essential for analyzing data and writing efficient database queries.

---

## 📌 Topics Covered
- GROUP BY Clause  
- Aggregate Functions  
- HAVING Clause  
- Subqueries  

---

## 📘 GROUP BY Clause

The `GROUP BY` clause is used to group rows that have the same values in specified columns and apply aggregate functions to each group.

### Example
```sql
SELECT department, COUNT(*) AS total_employees
FROM employees
GROUP BY department;
