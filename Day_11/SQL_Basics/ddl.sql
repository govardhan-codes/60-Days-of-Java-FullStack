-- DDL Commands

CREATE DATABASE college;
USE college;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

ALTER TABLE student ADD age INT;

TRUNCATE TABLE student;
