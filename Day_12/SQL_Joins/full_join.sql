SELECT e.emp_id, e.name, d.dept_name
FROM employees e
FULL JOIN departments d
ON e.dept_id = d.dept_id;
