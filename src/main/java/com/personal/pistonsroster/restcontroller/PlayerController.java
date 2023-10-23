package com.personal.pistonsroster.restcontroller;


import com.personal.pistonsroster.entity.Player;
import com.personal.pistonsroster.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class PlayerController {
    // inject employee dao for testing

    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService thePlayerService) {
        this.playerService = thePlayerService;
    }

    // expose "/player" and return a list of players
    @GetMapping("/players")
    public List<Player> findAll() {
        return playerService.findAll();
    }

    @GetMapping("/players/{id}")
    public Player findById(@PathVariable int id) {
        Player thePlayer = playerService.findById(id);

        if(thePlayer == null) {
            throw new RuntimeException("Player with number does not exist: " + id);
        }

        return thePlayer;
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player thePlayer) {
        Player thePlayerId = playerService.findById(thePlayer.getId());

        Player dbPlayer = playerService.save(thePlayer);

        return dbPlayer;
    }

    @PutMapping("/players")
    public Player updatePlayer(@RequestBody Player thePlayer) {
        Player dbPlayer = playerService.save(thePlayer);

        return dbPlayer;
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayer(@PathVariable int id) {
        Player thePlayer = playerService.findById(id);

        if(thePlayer == null) {
            throw new RuntimeException("Player with number does not exist: " + id);
        }

        playerService.deleteById(id);

    }
}
