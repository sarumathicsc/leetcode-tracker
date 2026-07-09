-- Last updated: 7/9/2026, 7:42:01 AM
UPDATE Salary 
SET sex = CASE WHEN sex = 'm' THEN 'f' ELSE 'm' END;
