-- Last updated: 7/9/2026, 7:42:29 AM
# Write your MySQL query statement below
SELECT 
    p.firstName,
    p.lastName,
    a.city,
    a.state
FROM Person p
LEFT JOIN Address a
        ON p.personId = a.personId;