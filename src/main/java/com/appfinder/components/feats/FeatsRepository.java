package com.appfinder.components.feats;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeatsRepository extends JpaRepository<Feats, Integer> {
    Feats findByName(String name);
    List<Feats> findByFeatIdIn(Integer[] ids);
}
