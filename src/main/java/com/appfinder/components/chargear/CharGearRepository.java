package com.appfinder.components.chargear;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharGearRepository extends JpaRepository<CharGear, Integer> {
    List<CharGear> findByCharId(int charId);
}
