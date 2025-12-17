-- DML Commands

INSERT INTO student VALUES (1, 'Ravi', 85, 20);
INSERT INTO student VALUES (2, 'Sita', 90, 21);

SELECT * FROM student;

UPDATE student SET marks = 95 WHERE id = 1;

DELETE FROM student WHERE id = 2;
