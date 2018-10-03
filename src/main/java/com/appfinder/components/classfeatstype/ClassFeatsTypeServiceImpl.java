package com.appfinder.components.classfeatstype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ClassFeatsTypeServiceImpl implements ClassFeatsTypeService {


    private final ClassFeatsTypeRepository classFeatsTypeRepository;

    @Autowired
    public ClassFeatsTypeServiceImpl(ClassFeatsTypeRepository classFeatsTypeRepository) {
        this.classFeatsTypeRepository = classFeatsTypeRepository;
    }

    @Override
    public ClassFeatsType getByClassFeatsTypeId(int classFeatId) {
        return classFeatsTypeRepository.findOne(classFeatId);
    }

    @Override
    public void saveClassFeatType(ClassFeatsType classFeat) {
        classFeatsTypeRepository.save(classFeat);
    }

    @Override
    public List<ClassFeatsType> getAllClassFeatsType() {
        return classFeatsTypeRepository.findAll();
    }


    @Override
    public ClassFeatsType getByName(String name) { return classFeatsTypeRepository.findByName(name); }

    @Override
    public ClassFeatsType getByShortName(String shortNm) { return classFeatsTypeRepository.findByShortName(shortNm); }

}
