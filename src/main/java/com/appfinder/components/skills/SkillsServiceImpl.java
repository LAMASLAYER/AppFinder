package com.appfinder.components.skills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsServiceImpl implements SkillsService {


    private final SkillsRepository skillsRepository;

    @Autowired
    public SkillsServiceImpl(SkillsRepository skillsRepository) {
        this.skillsRepository = skillsRepository;
    }

    @Override
    public Skills getSkillById(Integer skillId) {
        return skillsRepository.findOne(skillId);
    }

    @Override
    public void saveSkill(Skills skill) {
        skillsRepository.save(skill);
    }

    @Override
    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();
    }

    @Override
    public Skills getSkillByName(String name) { return skillsRepository.findByName(name); }

    @Override
    public List<Skills> getSkillsByPrimaryStat(String primaryStat) {
        return skillsRepository.findByPrimaryStat(primaryStat);
    }

    @Override
    public List<Skills> getSkillsByIdIn(Integer[] ids) {
        return skillsRepository.findBySkillIdIn(ids);
    }
}
