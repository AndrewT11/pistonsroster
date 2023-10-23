package com.personal.pistonsroster.restcontroller;

import com.personal.pistonsroster.dao.PlayerDAO;
import com.personal.pistonsroster.entity.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class PlayerController {
    // inject employee dao for testing
    private PlayerDAO playerDAO;

    public PlayerController(PlayerDAO thePlayerDAO) {
        this.playerDAO = thePlayerDAO;
    }

    // expose "/player" and return a list of players
    @GetMapping("/players")
    public List<Player> findAll() {
        return playerDAO.findAll();
    }
}
