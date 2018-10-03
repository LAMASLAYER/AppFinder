package com.appfinder.components.races;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RacesRepository extends JpaRepository<Races, Integer> {
    Races findByName(String name);
}
