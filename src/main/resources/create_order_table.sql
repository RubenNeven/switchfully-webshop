DROP TABLE IF EXISTS orders;

CREATE TABLE IF NOT EXISTS orders (
    id VARCHAR (50) PRIMARY KEY NOT NULL,
    customer VARCHAR (50),
    total_order_price DOUBLE PRECISION,
    FOREIGN KEY (customer) REFERENCES customers(id)
)