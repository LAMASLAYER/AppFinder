package com.appfinder.classSkills;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClassSkillsRepository extends JpaRepository<ClassSkills, Integer> {
    public List<ClassSkills> findByClassId(int classId);
}
