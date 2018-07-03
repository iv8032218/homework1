SELECT project.* FROM test_club_task3.project
JOIN test_club_task3.assign ON project.p_id=assign.p_id
WHERE assign.p_id IS NOT NULL AND assign.e_id IS NULL;