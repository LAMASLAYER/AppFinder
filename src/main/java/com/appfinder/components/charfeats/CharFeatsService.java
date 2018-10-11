package com.appfinder.components.charfeats;


import java.util.List;

public interface CharFeatsService {
    List<CharFeats> getByCharId(Integer charId);
    void saveCharFeat(CharFeats charFeat);
}
