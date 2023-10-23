package com.personal.pistonsroster.dao;

import com.personal.pistonsroster.entity.Player;

import java.util.List;

public interface PlayerDAO {

    List<Player> findAll();

    Player findById(int id);

    Player save(Player thePlayer);

    void deleteById(int id);
}
