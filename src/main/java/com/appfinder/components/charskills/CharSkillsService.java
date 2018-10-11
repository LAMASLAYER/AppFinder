package com.appfinder.components.charskills;


import java.util.List;

public interface CharSkillsService {
    List<CharSkills> getByCharId(Integer charId);
    void saveCharSkill(CharSkills charSkill);
}
