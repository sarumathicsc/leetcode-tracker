-- Last updated: 10/9/2026, 9:37:30 AM
SELECT 
    user_id, 
    MAX(time_stamp) AS last_stamp
FROM 
    Logins
WHERE 
    YEAR(time_stamp) = 2020
GROUP BY 
    user_id;
