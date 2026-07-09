-- Last updated: 7/9/2026, 7:42:25 AM
# Write your MySQL query statement below
SELECT
    score,
    DENSE_RANK() OVER(ORDER BY score DESC) AS 'rank'
FROM Scores;