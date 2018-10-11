package com.appfinder.components.classfeats;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassFeatsRepository extends JpaRepository<ClassFeats, Integer> {
    List<ClassFeats> findByClassId(int classId);
}
