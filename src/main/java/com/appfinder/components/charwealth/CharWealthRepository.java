package com.appfinder.components.charwealth;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharWealthRepository extends JpaRepository<CharWealth, Integer> {
    CharWealth findByCharId(int charId);
}
