package com.appfinder.components.charskills;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharSkillsRepository extends JpaRepository<CharSkills, Integer> {
    List<CharSkills> findByCharId(int charId);
}
