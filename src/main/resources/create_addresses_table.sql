DROP TABLE IF EXISTS addresses;

CREATE TABLE IF NOT EXISTS addresses (
    id VARCHAR(50) PRIMARY KEY NOT NULL,
    street VARCHAR(50),
    houseNumber VARCHAR(10),
    city VARCHAR(50),
    zip_code VARCHAR(10),
    country VARCHAR (25)
)

