DROP TABLE IF EXISTS items;

CREATE TABLE IF NOT EXISTS items (
    id VARCHAR (50) PRIMARY KEY NOT NULL,
    amount INTEGER,
    name VARCHAR (25),
    price DOUBLE PRECISION
)