-- Last updated: 7/9/2026, 7:42:21 AM
# Write your MySQL query statement below
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;
