package com.appfinder.components.racestraits;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RacesTraitsRepository extends JpaRepository<RacesTraits, Integer> {
    RacesTraits findByName(String name);
    List<RacesTraits> findByRaceId(int raceId);
}
