package com.personal.pistonsroster.service;

import com.personal.pistonsroster.dao.PlayerDAO;
import com.personal.pistonsroster.dao.PlayerDAOImpl;
import com.personal.pistonsroster.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{

    private PlayerDAO playerDAO;

    @Autowired
    public PlayerServiceImpl(PlayerDAO thePlayerDAO) {
        this.playerDAO = thePlayerDAO;
    }

    @Override
    public List<Player> findAll() {
        return playerDAO.findAll();
    }

    @Override
    public Player findById(int id) {
        return playerDAO.findById(id);
    }

    @Override
    @Transactional
    public Player save(Player thePlayer) {
        return playerDAO.save(thePlayer);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        playerDAO.deleteById(id);
    }
}
