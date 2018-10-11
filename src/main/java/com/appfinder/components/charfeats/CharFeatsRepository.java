package com.appfinder.components.charfeats;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharFeatsRepository extends JpaRepository<CharFeats, Integer> {
    List<CharFeats> findByCharId(int charId);
}
