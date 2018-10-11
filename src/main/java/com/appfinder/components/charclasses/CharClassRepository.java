package com.appfinder.components.charclasses;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharClassRepository extends JpaRepository<CharClass, Integer> {
    List<CharClass> findByCharId(int charId);
    CharClass findByCharIdAndAndClassId(int charId, int classId);
}
