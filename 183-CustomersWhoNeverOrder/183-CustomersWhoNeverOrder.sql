-- Last updated: 7/9/2026, 7:42:20 AM
# Write your MySQL query statement below
SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o
    ON c.id = o.CustomerId
WHERE O.id IS NULL;