package com.appfinder.components.classfeats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassFeatsServiceImpl implements ClassFeatsService {


    private final ClassFeatsRepository classFeatsRepository;

    @Autowired
    public ClassFeatsServiceImpl(ClassFeatsRepository classFeatRepository) {
        this.classFeatsRepository = classFeatRepository;
    }

    @Override
    public List<ClassFeats> getByClassId(Integer classId) {
        return classFeatsRepository.findByClassId(classId);
    }

    @Override
    public void saveClassFeat(ClassFeats classFeat) {
        classFeatsRepository.save(classFeat);
    }



}
