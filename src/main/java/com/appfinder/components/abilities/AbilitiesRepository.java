package com.appfinder.components.abilities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AbilitiesRepository extends JpaRepository<Abilities, Integer> {
    Abilities findByName(String name);
}
