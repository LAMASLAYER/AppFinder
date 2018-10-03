package com.appfinder.components.skills;

import java.util.List;

public interface SkillsService {
    Skills getSkillById(Integer skillId);
    void saveSkill(Skills skill);
    List<Skills> getAllSkills();
    Skills getSkillByName(String name);
    List<Skills> getSkillsByPrimaryStat(String primaryStat);
}
