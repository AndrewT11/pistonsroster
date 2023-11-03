USE `pistons_roster`;

DROP TABLE IF EXISTS `roles`;
DROP TABLE IF EXISTS `members`;

--
-- Table structure for table 'members
--

CREATE TABLE `members` (
    `user_id` varchar(50) NOT NULL,
    `pw` char(68) NOT NULL,
    `active` tinyint NOT NULL,
    PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table 'members'
--
-- NOTE: The passwords are encrypted using BCrypt
--
-- Generation tool for encrypted passwords: https://www.bcryptcalculator.com/
--
-- Default passwords for all users: testing123

INSERT INTO `members`
VALUES
('andrew','{bcrypt}$2a$10$x0jSk1oMB5lR25WhfcUF7ePEnfxNS500i2nwiGvUKWJ1cdHDGLO0C', 1),
('greg','{bcrypt}$2a$10$x0jSk1oMB5lR25WhfcUF7ePEnfxNS500i2nwiGvUKWJ1cdHDGLO0C', 1),
('monique','{bcrypt}$2a$10$x0jSk1oMB5lR25WhfcUF7ePEnfxNS500i2nwiGvUKWJ1cdHDGLO0C', 1);

--
-- Table structure for table 'authorities'
--

CREATE TABLE  `roles` (
    `user_id` varchar(50) NOT NULL,
    `role` varchar(50) NOT NULL,
    UNIQUE KEY `authorities5_idx_1` (`user_id`, `role`),
    CONSTRAINT `authorities5_ibfk_1` FOREIGN KEY(`user_id`) REFERENCES `members` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `roles`
--

INSERT INTO `roles`
VALUES
('andrew','ROLE_EMPLOYEE'),
('andrew','ROLE_MANAGER'),
('andrew','ROLE_ADMIN'),
('greg','ROLE_EMPLOYEE'),
('greg','ROLE_MANAGER'),
('monique','ROLE_EMPLOYEE');