CREATE TABLE IF NOT EXISTS customer
(
    id       bigint      NOT NULL,
    firstName varchar(20) NOT NULL,
    lastName varchar(20) NOT NULL,

    PRIMARY KEY (id)
);

insert into customer(id, firstName, lastName) values (1,  'Davi', 'Mustafa');