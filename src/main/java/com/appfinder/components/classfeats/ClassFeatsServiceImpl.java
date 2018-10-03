package com.appfinder.classFeats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ClassFeatsServiceImpl implements ClassFeatsService {


    private final ClassFeatsRepository classFeatsRepository;

    @Autowired
    public ClassFeatsServiceImpl(ClassFeatsRepository classFeatsRepository) {
        this.classFeatsRepository = classFeatsRepository;
    }

    @Override
    public ClassFeats getClassFeatById(Integer classFeatId) {
        return classFeatsRepository.findOne(classFeatId);
    }

    @Override
    public void saveClassFeat(ClassFeats classFeat) {
        classFeatsRepository.save(classFeat);
    }

    @Override
    public List<ClassFeats> getAllClassFeats() {
        return classFeatsRepository.findAll();
    }

    @Override
    public List<ClassFeats> getByClassId(int classId) { return classFeatsRepository.findByClassId(classId); }

    @Override
    public List<ClassFeats> getByName(String name) { return classFeatsRepository.findByName(name); }

    @Override
    public List<ClassFeats> getByType(int type) { return classFeatsRepository.findByType(type); }
}
