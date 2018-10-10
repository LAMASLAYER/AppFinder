package com.appfinder.components.classes;

import java.util.List;

public interface ClassesService {
    Classes getClassById(Integer classId);
    void saveClass(Classes _class);
    List<Classes> getAllClasses();
    Classes getClassByName(String name);
    List<Classes> getClassesByIdIn(Integer[] ids);

}
