-- Last updated: 7/9/2026, 7:41:41 AM
SELECT DISTINCT 
    author_id AS id
FROM 
    Views
WHERE 
    author_id = viewer_id
ORDER BY 
    id ASC;
