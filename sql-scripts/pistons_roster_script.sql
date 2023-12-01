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
	(1, 2, 'Cade', 'Cunningham', 'PG'),
    (2, 35, 'Marvin', 'Bagley III', 'PF'),
    (3, 27, 'Buddy', 'Boeheim', 'F'),
    (4, 44, 'Bojan', 'Bogdanovic', 'SF'),
    (5, 14, 'Alec', 'Burks', 'SG'),
    (6, 20, 'Malcolm', 'Cazalon', 'G'),
    (7, 0, 'Jalen', 'Duren', 'C'),
    (8, 31,'Joe','Harris','SF'),
    (9, 7,'Killian','Hayes','PG'),
    (10, 23,'Jaden','Ivey','G'),
    (11, 12,'Isaiah','Livers','PF'),
    (12, 5,'Monte','Morris','PG'),
    (13, 4,'Jontay','Porter','C'),
    (14, 8,'Jared','Rhoden','G'),
    (15, 28,'Isaiah','Stewart','C'),
    (16, 9,'Ausar','Thompson','F'),
    (17, 13,'James','Wiseman','C');
    