package com.appfinder.abilities;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbilitiesRepository extends JpaRepository<Abilities, Integer> {
    Abilities findByName(String name);
}
