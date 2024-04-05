


DROP DATABASE IF EXISTS PJT_COSPI200;
CREATE DATABASE IF NOT EXISTS PJT_COSPI200;

USE PJT_COSPI200;

CREATE TABLE IF NOT EXISTS description (

	id INT NOT NULL PRIMARY KEY,
    data VARCHAR(1000) NOT NULL

);
CREATE TABLE IF NOT EXISTS price(
	id INT NOT NULL PRIMARY KEY
    
);
DROP TABLE IF EXISTS price;

SELECT * FROM price;

ALTER TABLE price ADD COLUMN `1` INT NOT NULL;

CREATE TABLE IF NOT EXISTS financial(
	id INT NOT NULL PRIMARY KEY,
    PER DOUBLE ,
    PBR DOUBLE ,
    PCR DOUBLE ,
    EV_EBITDA DOUBLE

);