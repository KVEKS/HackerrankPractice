-- # Problem: https://www.hackerrank.com/challenges/occupations/problem
-- # Score: 30


SELECT * FROM 
(SELECT MIN(Doctor) d, MIN(Professor) p, MIN(Singer) s, MIN(Actor) a FROM 
(SELECT 
    CASE WHEN Occupation = 'Doctor' THEN Name END AS Doctor, 
    CASE WHEN Occupation = 'Professor' THEN Name END AS Professor,
    CASE WHEN Occupation = 'Singer' THEN Name END AS Singer,
    CASE WHEN Occupation = 'Actor' THEN Name END AS Actor, 
    RANK() OVER (PARTITION BY Occupation ORDER BY Name) AS ROW_RANK FROM Occupations)x 
    GROUP BY ROW_RANK) ORDER BY d, p, s, a;
