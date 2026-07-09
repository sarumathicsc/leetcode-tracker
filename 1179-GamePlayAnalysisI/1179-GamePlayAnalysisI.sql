-- Last updated: 7/9/2026, 7:41:43 AM
SELECT player_id, MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;
