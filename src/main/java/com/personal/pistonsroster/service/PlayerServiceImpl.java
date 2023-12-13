package com.personal.pistonsroster.service;

import com.personal.pistonsroster.dao.PlayerRepository;
import com.personal.pistonsroster.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//@Service
public class PlayerServiceImpl implements PlayerService{

    private PlayerRepository playerRepository;

    @Autowired
    public PlayerServiceImpl(PlayerRepository thePlayerRepository) {

        this.playerRepository = thePlayerRepository;
    }

    @Override
    public List<Player> findAll() {

        return playerRepository.findAll();
    }

    @Override
    public Player findById(int id) {
        Optional<Player> result = playerRepository.findById(id);

        Player thePlayer = null;

        if(result.isPresent()) {
            thePlayer = result.get();
        } else {
            // did not find player by that id
            throw new RuntimeException("Did not find player id - " + id);
        }

        return thePlayer;
    }

    @Override
    public Player save(Player thePlayer) {
        return playerRepository.save(thePlayer);
    }

    @Override
    public void deleteById(int id) {
        playerRepository.deleteById(id);
    }
}
