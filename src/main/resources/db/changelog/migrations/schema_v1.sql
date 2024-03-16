CREATE TABLE netology_task.customers
(
    id				SERIAL		NOT NULL	PRIMARY KEY,
    name			VARCHAR(30) NOT NULL,
    surname 		VARCHAR(30) NOT NULL,
    age				INTEGER		NOT NULL
        check (age between 16 and 110), /*устанавливаем границы допустимых возрастов*/
    phone_number	DOUBLE PRECISION UNIQUE
        check (length(phone_number::text) BETWEEN 11 AND 15) /*устанавливаем допустимую длинну номера*/
);
CREATE TABLE netology_task.orders
(
    id				SERIAL			NOT NULL	PRIMARY KEY,
    date			DATE			NOT NULL,
    customer_id 	INTEGER 	 	NOT NULL,
    product_name	VARCHAR(200)	NOT NULL,
    amount			INTEGER			NOT NULL
);
