SELECT 
    Name, Surname
FROM
    test_club.peopleinfo
        JOIN
    test_club.countryinfo ON peopleinfo.city_id = countryinfo.city_id
WHERE
    peopleinfo.isOccupied = 0
        AND countryinfo.CountryName IN ('United Kingdom', 'Spain')
        AND countryinfo.isCapital = 1;