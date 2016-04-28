/* https://www.hackerrank.com/challenges/the-pads */

SELECT concat(Name, "(", LEFT(Occupation, 1) ,")")
FROM Occupations
ORDER BY Name;
SELECT  concat("There are total ", COUNT(Occupation), " ", LOWER(Occupation), "s.")
FROM Occupations
GROUP BY Occupation
ORDER BY COUNT(Occupation) ASC, Occupation ASC;
