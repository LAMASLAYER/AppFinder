package com.appfinder.components.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassesServiceImpl implements ClassesService {


    private final ClassesRepository classesRepository;

    @Autowired
    public ClassesServiceImpl(ClassesRepository classesRepository) {
        this.classesRepository = classesRepository;
    }

    @Override
    public Classes getClassById(Integer classId) {
        return classesRepository.findOne(classId);
    }

    @Override
    public void saveClass(Classes cClass) {
        classesRepository.save(cClass);
    }

    @Override
    public List<Classes> getAllClasses() {
        return classesRepository.findAll();
    }

    @Override
    public Classes getClassByName(String name) { return classesRepository.findByName(name); }

    @Override
    public List<Classes> getClassesByIdIn(Integer[] ids) {
        return classesRepository.findByClassIdIn(ids);
    }
}
