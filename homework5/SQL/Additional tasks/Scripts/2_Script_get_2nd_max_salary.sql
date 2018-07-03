SELECT MAX(SALARY) FROM test_club_additional_task.`emp a`
WHERE SALARY < (SELECT MAX(SALARY) FROM test_club_additional_task.`emp a`);