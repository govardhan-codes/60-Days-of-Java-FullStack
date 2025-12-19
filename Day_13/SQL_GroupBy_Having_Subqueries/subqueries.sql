SELECT name
FROM employees e
WHERE EXISTS (
    SELECT 1
    FROM projects p
    WHERE p.emp_id = e.id
);
