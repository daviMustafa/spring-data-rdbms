CREATE TABLE IF NOT EXISTS customer
(
    id        bigint      NOT NULL AUTO_INCREMENT,
    firstName varchar(20) NOT NULL,
    lastName  varchar(20) NOT NULL,

    PRIMARY KEY (id)
);

insert into customer(firstName, lastName)
values ('Davi', 'Mustafa');

insert into customer(firstName, lastName)
values ( 'TestFirstName', 'TestLastName');