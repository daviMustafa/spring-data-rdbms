if not exists(select *
              from sysobjects
              where name = 'customer'
                and xtype = 'U')
create table customer
(
    id        bigint identity NOT NULL PRIMARY KEY,
    firstName varchar(20)     NOT NULL,
    lastName  varchar(20)     NOT NULL,
)

insert into customer(firstName, lastName)
values ('Davi', 'Mustafa'),
       ('TestFirstName', 'TestLastName');


