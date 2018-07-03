SELECT DISTINCT ClientId FROM test_club_task4.services
WHERE RegionID LIKE (SELECT RegionId FROM services GROUP BY RegionId HAVING count(*)>1);