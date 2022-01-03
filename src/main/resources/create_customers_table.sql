DROP TABLE IF EXISTS customers;

CREATE TABLE IF NOT EXISTS customers (
    id VARCHAR (50) PRIMARY KEY NOT NULL,
    first_name VARCHAR (25),
    last_name VARCHAR (25),
    email_address VARCHAR (50),
    address VARCHAR (50),
    phone_number VARCHAR (50),
    FOREIGN KEY (address) REFERENCES addresses(id)
)

