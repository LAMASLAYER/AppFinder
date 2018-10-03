package com.appfinder.components.classes;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {
    Classes findByName(String name);
}
