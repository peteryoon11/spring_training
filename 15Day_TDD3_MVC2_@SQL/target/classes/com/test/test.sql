drop table dept cascade constraints;
create table dept
(deptno number(4) , dname varchar2(30),
loc varchar2(20));

insert into dept(deptno, dname,loc)
values(99,'aa','bb');


insert into dept(deptno, dname,loc)
values(98,'aa2','bb2');