SELECT e1.name AS Employee, e2.name AS Manager
FROM employees e1
JOIN employees e2
ON e1.manager_id = e2.emp_id;
