-- Last updated: 10/9/2026, 9:36:31 AM
select 
    teacher_id,
    COUNT(DISTINCT subject_id) AS cnt
FROM
    Teacher
group by
    teacher_id;