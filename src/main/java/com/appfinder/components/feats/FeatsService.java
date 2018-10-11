package com.appfinder.components.feats;

import java.util.List;

public interface FeatsService {
    Feats getFeatById(Integer featId);
    void saveFeat(Feats feat);
    List<Feats> getAllFeats();
    Feats getFeatByName(String name);
    List<Feats> getByFeatsIdsIn(Integer[] ids);
}
