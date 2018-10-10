package com.appfinder.components.classes;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {
    Classes findByName(String name);
    List<Classes> findByClassIdIn(Integer[] ids);

}
