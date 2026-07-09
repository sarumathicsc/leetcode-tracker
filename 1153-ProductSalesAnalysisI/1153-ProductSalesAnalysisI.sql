-- Last updated: 7/9/2026, 7:41:45 AM
SELECT 
    p.product_name, 
    s.year, 
    s.price
FROM 
    Sales s
INNER JOIN 
    Product p 
ON 
    s.product_id = p.product_id;
