# Pistons Roster
simple Java Spring Boot REST API for Detroit Pistons roster.

# Get Started
## Recommended to use MySQL Workbench to for data interaction.
## in application.properties file, input your username and password for your unique MySQL connection.
## Open included .SQL script in MySQL Workbench:  
### pistons_roster_script.sql

## Use PostMan to execute CRUD commands.

### GET endpoints:
#### Get all players: http://localhost:8080/players
#### Get player by number: http://localhost:8080/players/{number}

### POST endpoint:
#### Add a new player: http://localhost:8080/players
#### JSON format for adding player example: 
    {
      "id": 25,
      "firstName": "Marcus",
      "lastName": "Sasser",
      "position": "PG"
      }

### PUT endpoint:
#### Update a player: http://localhost:8080/players

### DELETE endpoint:
#### Delete a player: http://localhost:8080/players/{number}
