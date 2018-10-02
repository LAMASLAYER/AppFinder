package com.appfinder.classFeats;

import java.util.List;

public interface ClassFeatsService {
    ClassFeats getClassFeatById(Integer classFeatId);
    void saveClassFeat(ClassFeats classFeat);
    List<ClassFeats> getAllClassFeats();
    List<ClassFeats> getByClassId(int classId);
    List<ClassFeats> getByName(String name);
    List<ClassFeats> getByType(int type);
}
