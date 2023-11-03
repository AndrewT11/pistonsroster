# Pistons Roster
Java Spring Boot REST API for Detroit Pistons roster with authentication/authorization permissions.

## Get Started
Recommended to use MySQL Workbench to for data interaction.
In application.properties file, input your username and password for your unique MySQL connection.
Open included .SQL script in sql_script folder in MySQL Workbench:  
* pistons_roster_script.sql
* setup-spring-security-database-bcrypt-custom-tables.sql

## Features
* GET, POST, PUT, and DELETE commands to read and modify your roster
* Spring Security used for user/password and user/authorities permission

## To run CRUD commands 
* Use PostMan, which can be downloaded from https://www.postman.com/. Simple GET commands easily run in browser.
* User and password will be needed in authorization tab. Use basic auth. 
** Users and permissions: andrew (EMPLOYEE, MANAGER, ADMIN), greg (EMPLOYEE, MANAGER), monique (EMPLOYEE)
** All passwords: testing123
** Password may be changed in setup-spring-security-database-bcrypt-custom-tables.sql file, but must use bcrypt encryption or change password to {noop} for plain text. Changing {bcrypt} password can be done at https://www.bcryptcalculator.com/
** EMPLOYEE permission allows all GET commands.
** MANAGER permission allows for POST and PUT commands.
** ADMIN permission allows for DELETE command.

## GET endpoints:
* Get all players: http://localhost:8080/players
* Get player by number: http://localhost:8080/players/{number}

## POST endpoint:
* Add a new player: http://localhost:8080/players
* JSON format for adding player example: 
    {
      "id": 25,
      "firstName": "Marcus",
      "lastName": "Sasser",
      "position": "PG"
      }

## PUT endpoint:
* Update a player: http://localhost:8080/players
* JSON format for updating player example: 
    {
      "id": 25,
      "firstName": "Marcus",
      "lastName": "Sasser",
      "position": "PG"
      }

## DELETE endpoint:
* Delete a player: http://localhost:8080/players/{number}

## Technologies
* Java
* Spring, Spring Boot
* MySQL

## Credits
* Andrew Tran sole author
