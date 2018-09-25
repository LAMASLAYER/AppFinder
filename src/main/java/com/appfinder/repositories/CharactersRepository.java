package com.appfinder.repositories;

import com.appfinder.models.Characters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharactersRepository extends JpaRepository<Characters, Integer> {
}
