package com.appfinder.repositories;

import com.appfinder.models.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Players, Integer> {
}
