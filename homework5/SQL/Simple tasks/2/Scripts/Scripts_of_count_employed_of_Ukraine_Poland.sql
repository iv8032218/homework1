SELECT 
    COUNT(peopleinfo.id) AS NumberOfOccupied
FROM
    test_club.peopleinfo
        JOIN
    test_club.countryinfo ON peopleinfo.city_id = countryinfo.city_id
WHERE
    peopleinfo.isOccupied = 1
        AND countryinfo.CountryName IN ('Ukraine', 'Poland')
        AND (countryinfo.Population BETWEEN 500000 AND 1000000
        OR ((countryinfo.Population BETWEEN 10000 AND 50000)
        AND countryinfo.isCapital = 0));