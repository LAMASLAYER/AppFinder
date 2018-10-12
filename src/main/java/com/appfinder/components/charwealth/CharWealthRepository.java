package com.appfinder.components.charwealth;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharWealthRepository extends JpaRepository<CharWealth, Integer> {
    CharWealth findByCharId(int charId);
}
