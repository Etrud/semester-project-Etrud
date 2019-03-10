create table EMPLOYEE
(
  first_name varchar(20) not null,
  last_name varchar(20) not null,
  email varchar(20) not null,
  phone varchar(20) not null,
  constraint employee_pk
    primary key (email)
);