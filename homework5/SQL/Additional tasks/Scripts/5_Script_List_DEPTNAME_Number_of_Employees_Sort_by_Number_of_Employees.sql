SELECT `dept b`.DEPTNAME, COUNT(`emp a`.EMPID) AS NumberOfEmployees FROM test_club_additional_task.`emp a`
JOIN test_club_additional_task.`dept b` ON `emp a`.DEPTID=`dept b`.DEPTID
GROUP BY DEPTNAME;