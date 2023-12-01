CREATE DATABASE  IF NOT EXISTS `pistons_roster`;
USE `pistons_roster`;

--
-- table structure for table 'roster'

DROP TABLE IF EXISTS `roster`;

CREATE TABLE `roster`(
    `id` int NOT NULL AUTO_INCREMENT,
	`number` int NOT NULL,
    `first_name` VARCHAR(45) DEFAULT NULL,
    `last_name` VARCHAR(45) DEFAULT NULL,
    `position` VARCHAR(15) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

--
-- Data for table 'roster'
--

INSERT INTO `roster` VALUES
	(2, 'Cade', 'Cunningham', 'PG'),
    (35, 'Marvin', 'Bagley III', 'PF'),
    (27, 'Buddy', 'Boeheim', 'F'),
    (44, 'Bojan', 'Bogdanovic', 'SF'),
    (14, 'Alec', 'Burks', 'SG'),
    (20, 'Malcolm', 'Cazalon', 'G'),
    (0, 'Jalen', 'Duren', 'C'),
    (31,'Joe','Harris','SF'),
    (7,'Killian','Hayes','PG'),
    (23,'Jaden','Ivey','G'),
    (12,'Isaiah','Livers','PF'),
    (5,'Monte','Morris','PG'),
    (4,'Jontay','Porter','C'),
    (8,'Jared','Rhoden','G'),
    (28,'Isaiah','Stewart','C'),
    (9,'Ausar','Thompson','F'),
    (13,'James','Wiseman','C');
    