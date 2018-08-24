CREATE DATABASE RESERVATION

USE RESERVATION

select * from passanger;

select * from user;

select * from flight;

select * from reservation;

UPDATE USER
SET FIRST_NAME = 'mikika'
WHERE ID=1;

insert into flight values(1,'AUS',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'NYC','2018-02-05 03:14:07', 'AA1','American Airlines');

insert into flight values(2,'AUS',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'NYC','2018-02-05 05:14:07', 'AA2','American Airlines');

insert into flight values(3,'AUS',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'NYC','2018-02-05 06:14:07', 'AA3','American Airlines');

insert into flight values(4,'AUS',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'NYC','2018-02-05 07:14:07', 'SW1','South West');

insert into flight values(5,'NYC',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'DAL','2018-02-05 10:14:07', 'UA1','United Airlines');

insert into flight values(6,'NYC',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'DAL','2018-02-05 11:14:07', 'UA2','United Airlines');

insert into flight values(7,'NYC',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'AUS','2018-02-06 07:14:07', 'SW1','South West');

insert into flight values(8,'NYC',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'AUS','2018-02-06 08:14:07', 'SW2','South West');

insert into flight values(9,'NYC',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'DAL','2018-02-06 08:14:07', 'SW3','South West');

insert into flight values(10,'NYC',STR_TO_DATE('02-05-2018', '%m-%d-%Y'),'DAL','2018-02-06 09:14:07', 'UA1','United Airlines');







