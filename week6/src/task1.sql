#1
create table student (
    SNO varchar(20),
    Name varchar(10),
    Age Integer,
    College varchar(30)
    );

#2
insert into student values ('s001','老大',20,'计算机学院');
insert into student values ('s002','老二',19,'计算机学院');
insert into student values ('s003','老三',18,'计算机学院');
insert into student values ('s004','老四',17,'计算机学院');

#3
select * from student;

#4
delect from student where SNO = 's004' ;

#5
select * from student where SNO = 's003';

#6
update student set College = '通信学院' where SNO = 's001';

