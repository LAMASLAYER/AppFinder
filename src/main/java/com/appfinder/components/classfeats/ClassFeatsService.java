package com.appfinder.components.classfeats;


import java.util.List;

public interface ClassFeatsService {
    List<ClassFeats> getByClassId(Integer classId);
    void saveClassFeat(ClassFeats classFeat);
}
