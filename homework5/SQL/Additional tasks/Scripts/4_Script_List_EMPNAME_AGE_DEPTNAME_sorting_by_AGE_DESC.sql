SELECT `emp a`.EMPNAME, `emp a`.DOB, `dept b`.DEPTNAME FROM test_club_additional_task.`emp a`
JOIN test_club_additional_task.`dept b` ON `emp a`.DEPTID=`dept b`.DEPTID
ORDER BY `emp a`.DOB DESC;