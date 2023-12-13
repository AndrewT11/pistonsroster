package com.personal.pistonsroster.service;

import com.personal.pistonsroster.entity.Player;

import java.util.List;

public interface PlayerService {

    List<Player> findAll();

    Player findById(int id);

    Player save(Player thePlayer);

    void deleteById(int id);
}
