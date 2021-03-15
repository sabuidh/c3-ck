#1
CREATE TABLE cqupt_student(
                              studentid VARCHAR(10),
                              NAME VARCHAR(20),
                              sex VARCHAR(2),
                              age INTEGER,
                              Fee DECIMAL(10,2),
                              address VARCHAR(50),
                              memo VARCHAR(300)
);

#2
create table CourseAa(
                         Aa1 varchar(20),
                         Aa2 integer,
                         Aa3 decimal(10)
);

#3
create table ChooseBb(
Bb1 varchar(30),
Bb2 integer,
Bb3 decimal(10)
);

#4
alter table ChooseBb add Bb4 varchar(20) not null default '系统测试值';

#5
alter table ChooseBb add Bb5 varchar(10) key;

#6
create view view_choosebb as select Bb1 View_bb1,Bb4 View_bb2,Bb5 View_bb3 from ChooseBb;

#7
drop view view_choosebb;

#8
create index index_bb2 on ChooseBb(Bb2);
create index index_bb4 on ChooseBb(Bb4);

#9
drop index index_bb2;

#10
CREATE TABLE TEST(
                     NAME VARCHAR(20),
                     Age INTEGER,
                     Score NUMERIC(10,2),
                     Address VARCHAR(60)
);

#11
insert into test values ('赵一',20,580.00,'重邮宿舍 12-3-5');
insert into test values('钱二',19,540.00,'南福苑 5-2-9');
insert into test values('孙三',21,555.50,'学生新区 21-5-15');
insert into test values('李四',22,505.00,'重邮宿舍 8-6-22');
insert into test values('周五',20,495.50,'学生新区 23-4-8');
insert into test values('吴六',19,435.00,'南福苑 2-5-12');

#12
create table test_temp(
Name varchar(20),
Age integer,
Score Numeric(10,2),
Address varchar(60)
);

#13
insert into test_temp values ('郑七',21,490.50,'重邮宿舍 11-2-1');
insert into test_temp values ('张八',20,560.00,'南福苑 3-3-3');
insert into test_temp values ('王九',10,515.00,'学生新区 19-7-1');

#14
insert into test select * from test_temp;

#15
update test set score = score+5 where age <= 20;

#16
update test set age=age-1 where address = '南福苑%';

#17
delete from test where age >= 21 and score >= 500;

#18
delete from test where score <= 550 and address = '重邮宿舍%';

#19
create table Student(
    SNO varchar(20),
    Name varchar(10),
    Age integer,
    College varchar(30)
);

#20
create table Course(
    CourseID varchar(15),
    CourseName varchar (30),
    CourseBeforeID varchar (15)
);

#21
create table Choose(
    SNO varchar (20),
    CourseID varchar (30),
    Score DECIMAL (5,2)
);

#22
insert into student values ('S00001','张三',20,'计算机学院');
insert into student values ('S00002','李四',19,'通信学院');
insert into student values ('S00003','王五',21,'计算机学院');

#23
insert into student values ('C1','计算机引论',null);
insert into course values ('C2','C语言','C1');
insert into course values ('C3','数据结构','C2');

#24
insert into Choose values ('S00001','C1',95);
insert into Choose values ('S00001','C2',80);
insert into Choose values ('S00001','C3',84);
insert into Choose values ('S00002','C1',80);
insert into Choose values ('S00002','C2',85);
insert into Choose values ('S00003','C1',78);
insert into Choose values ('S00003','C3',70);

#25
select * from student where college = '计算机学院';

#26
mysql> select * from student where age between 20 and 23;

#27
select count(*) from student;

#28
select max(score),MIN(score),sum(score),avg(score) from choose where CourseID = 'C1';

#29
select CourseID,CourseName from course where coursebeforeID is null;

#30
select student.sno,student.`NAME`,course.courseName,choose.score from choose ,student,course where choose.sno = student.sno and choose.courseID = course.courseID;

#31
select * from student where college in (select college FROM student WHERE name like '张三');

#32
select student.sno,choose.score from choose,student where choose.score < (
    select score from choose,student where choose.sno = student.sno and choose.courseID like 'c1' and student.`NAME` like '张三') and choose.sno = student.sno and choose.courseID like 'c1';

#33
select s1.sno from (select * from choose where courseid='c1' union select * from choose where courseid='c2') s1;

#34
select distinct s1.sno from (select * from choose where courseid='c1' union select * from choose where courseid='c2') s1;