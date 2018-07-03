SELECT `emp a`.EMPNAME, `emp a`.MGRID, `dept b`.DEPTNAME FROM test_club_additional_task.`emp a`
JOIN test_club_additional_task.`dept b` ON `emp a`.DEPTID=`dept b`.DEPTID;