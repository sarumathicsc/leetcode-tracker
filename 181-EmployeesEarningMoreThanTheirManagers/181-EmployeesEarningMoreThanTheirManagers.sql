-- Last updated: 7/9/2026, 7:42:22 AM
# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e
INNER JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;