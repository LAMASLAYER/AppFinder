package com.appfinder.classSkills;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassSkillsServiceImpl implements ClassSkillsService {


    private final ClassSkillsRepository classSkillsRepository;

    @Autowired
    public ClassSkillsServiceImpl(ClassSkillsRepository classSkillsRepository) {
        this.classSkillsRepository = classSkillsRepository;
    }

    @Override
    public ClassSkills getClassSkillById(Integer classSkillId) {
        return classSkillsRepository.findOne(classSkillId);
    }

    @Override
    public void saveClassSkill(ClassSkills classSkill) {
        classSkillsRepository.save(classSkill);
    }

    @Override
    public List<ClassSkills> getAllClassSkills() {
        return classSkillsRepository.findAll();
    }

    @Override
    public List<ClassSkills> getByClassId(int classId) { return classSkillsRepository.findByClassId(classId); }

}
