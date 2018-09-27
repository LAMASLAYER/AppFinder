package com.appfinder.characters;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharactersRepository extends JpaRepository<Characters, Integer> {
    List<Characters> findByPlayerId(int playerId);
}
