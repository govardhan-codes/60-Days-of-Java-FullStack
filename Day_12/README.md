# Day 12 – SQL Joins

📅 **Day 12 of My Java Full Stack Learning Journey**

Today I learned one of the most important concepts in SQL — **JOINS**.  
Joins are used to combine data from two or more tables based on a related column.

---

## 🔹 Types of SQL Joins Covered

### 1️⃣ INNER JOIN
Returns only the matching records from both tables.

```sql
SELECT e.emp_id, e.name, d.dept_name
FROM employees e
INNER JOIN departments d
ON e.dept_id = d.dept_id;
