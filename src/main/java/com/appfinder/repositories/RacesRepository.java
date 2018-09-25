package com.appfinder.repositories;

import com.appfinder.models.Races;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RacesRepository extends JpaRepository<Races, Integer> {
}
