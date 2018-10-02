package com.appfinder.classFeats;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassFeatsRepository extends JpaRepository<ClassFeats, Integer> {
    public List<ClassFeats> findByClassId(int classId);
    public List<ClassFeats> findByType(int type);
    public List<ClassFeats> findByName(String name);
}
