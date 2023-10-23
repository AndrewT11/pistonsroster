package com.personal.pistonsroster.dao;

import com.personal.pistonsroster.entity.Player;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlayerDAOImpl implements PlayerDAO {

    // define field for entity manager

    private EntityManager entityManager;

    @Autowired
    public PlayerDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Player> findAll() {
        // create query
        TypedQuery<Player> theQuery = entityManager.createQuery("from Player", Player.class);

        // execute query and get result list
        List<Player> players = theQuery.getResultList();

        // return results
        return players;
    }

    @Override
    public Player findById(int id) {
        //get player
        Player thePlayer = entityManager.find(Player.class, id);

        // return player
        return thePlayer;
    }

    @Override
    public Player save(Player thePlayer) {
        Player dbPlayer = entityManager.merge(thePlayer);

        return dbPlayer;
    }

    @Override
    public void deleteById(int id) {
        Player thePlayer = entityManager.find(Player.class, id);

        entityManager.remove(thePlayer);
    }
}
