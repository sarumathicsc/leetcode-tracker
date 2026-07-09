-- Last updated: 7/9/2026, 7:42:03 AM
SELECT class 
FROM Courses 
GROUP BY class 
HAVING COUNT(student) >= 5;
