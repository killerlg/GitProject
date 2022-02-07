SELECT * FROM quanlysinhvien.subject
where credit = (select MAX(Credit) from subject)

select * from student as st
join mark as m on st.StudentId = m.StudentId 
where mark = (select MAX(Mark) from mark)

select st.StudentId, st.StudentName, st.Address, st.Phone, st.Status, st.ClassId, AVG(Mark) from student as st
join mark as m on st.StudentId = m.StudentId 
group by st.StudentId