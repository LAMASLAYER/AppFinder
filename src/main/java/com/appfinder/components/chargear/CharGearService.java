package com.appfinder.components.chargear;


import java.util.List;

public interface CharGearService {
    List<CharGear> getByCharId(Integer charId);
    void saveCharGear(CharGear charGear);
}
