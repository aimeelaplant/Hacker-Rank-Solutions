# https://www.hackerrank.com/challenges/asian-population
select sum(CITY.POPULATION)
from CITY
inner join COUNTRY on CITY.COUNTRYCODE = COUNTRY.CODE
where COUNTRY.CONTINENT = 'Asia'
