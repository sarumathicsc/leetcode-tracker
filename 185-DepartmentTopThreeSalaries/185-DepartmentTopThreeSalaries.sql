-- Last updated: 7/9/2026, 7:42:17 AM
# Write your MySQL query statement below
SELECT 
    Department,
    Employee,
    Salary
FROM (
    SELECT 
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS drnk
    FROM Employee e
    INNER JOIN Department d 
        ON e.departmentId = d.id
) t
WHERE drnk <= 3;
