USE QuanLySinhVien;
Select * From Student
Where StudentName LIKE 'h%';

Select * From class
where MONTH(StartDate) = 12;

Select * From Subject
where credit between 3 and 5;

Update Student
Set classid = 2
where StudentName = 'Hung'

SELECT ST.StudentName, S.Subname, M.Mark FROM MARK as M
JOIN Subject as S ON M.SubID = S.SubID
JOIN Student St ON M.StudentID = St.StudentID
Order by Mark DESC, St.StudentName ASC 