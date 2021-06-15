CREATE SEQUENCE IF NOT EXISTS customer_id_seq;

CREATE TABLE IF NOT EXISTS customer
(
    id        BIGINT DEFAULT nextval('customer_id_seq') NOT NULL,
    firstName varchar(20)     NOT NULL,
    lastName  varchar(20)     NOT NULL,
    PRIMARY KEY (id)
);

insert into customer(id, firstName, lastName)
values (1,'Davi', 'Mustafa'),
       (2, 'TestFirstName', 'TestLastName');

ALTER SEQUENCE customer_id_seq RESTART WITH 3;