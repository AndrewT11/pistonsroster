package com.personal.pistonsroster.dao;

import com.personal.pistonsroster.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    // using Spring Data JPA repository to eliminate writing DAO code.
}
