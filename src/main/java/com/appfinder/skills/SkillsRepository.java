package com.appfinder.skills;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillsRepository extends JpaRepository<Skills, Integer> {
    Skills findByName(String name);
    List<Skills> findByPrimaryStat(String primaryStat);
}
