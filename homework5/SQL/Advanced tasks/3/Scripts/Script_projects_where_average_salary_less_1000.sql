SELECT DISTINCT project.* FROM test_club_task3.project
JOIN test_club_task3.assign ON project.p_id=assign.p_id
JOIN test_club_task3.empl ON assign.e_id=empl.e_id
WHERE assign.e_id=empl.e_id
AND (SELECT AVG(empl.Salary)<1000);