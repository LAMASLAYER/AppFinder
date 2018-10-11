package com.appfinder.components.charskills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharSkillsServiceImpl implements CharSkillsService {


    private final CharSkillsRepository charSkillsRepository;

    @Autowired
    public CharSkillsServiceImpl(CharSkillsRepository charSkillRepository) {
        this.charSkillsRepository = charSkillRepository;
    }

    @Override
    public List<CharSkills> getByCharId(Integer charId) {
        return charSkillsRepository.findByCharId(charId);
    }

    @Override
    public void saveCharSkill(CharSkills charSkill) {
        charSkillsRepository.save(charSkill);
    }



}
