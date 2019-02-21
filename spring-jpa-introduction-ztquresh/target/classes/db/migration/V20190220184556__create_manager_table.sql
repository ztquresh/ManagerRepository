create table manager
(
  id int,
  first_name varchar(24) not null,
  last_name varchar(24) not null,
  department varchar(24) not null,
  constraint manager_pk
    primary key (id)
);

create unique index manager_first_name_uindex
  on manager(first_name);
create unique index manager_last_name_uindex
  on manager (last_name);
create unique index manager_department_uindex
  on manager (department);

