package com.appfinder.classFeatsType;

import java.util.List;


public interface ClassFeatsTypeService {
    void saveClassFeatType(ClassFeatsType classFeat);
    ClassFeatsType getByName(String name);
    ClassFeatsType getByClassFeatsTypeId(int id);
    ClassFeatsType getByShortName(String shortNm);
    List<ClassFeatsType> getAllClassFeatsType();
}
