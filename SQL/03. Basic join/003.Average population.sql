select country.continent, round(avg(city.population), 0) 
from city
join country
on city.countrycode = country.code
group by country.continent;
