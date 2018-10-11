package com.appfinder.components.charclasses;


import java.util.List;

public interface CharClassService {
    List<CharClass> getByCharId(Integer charId);
    void saveCharClass(CharClass charClass);
    CharClass getByCharIdAndClassId(int charId, int classId);
}
