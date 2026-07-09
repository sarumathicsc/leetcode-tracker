-- Last updated: 7/9/2026, 7:41:26 AM
SELECT 
    eu.unique_id, 
    e.name
FROM 
    Employees e
LEFT JOIN 
    EmployeeUNI eu 
ON 
    e.id = eu.id;
