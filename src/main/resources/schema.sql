DROP TABLE IF EXISTS CUSTOMERS;

CREATE TABLE CUSTOMERS
(
    ID         VARCHAR(25),
    FIRST_NAME VARCHAR(250) NOT NULL,
    LAST_NAME  VARCHAR(250) NOT NULL,
    EMAIL      VARCHAR(250) NOT NULL,
    PHONE      VARCHAR(250) NOT NULL
);