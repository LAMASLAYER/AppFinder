package com.appfinder.gearType;


import java.util.List;

public interface GearTypeService {
    GearType getByGearTypeId(Integer gearId);
    void saveGear(GearType gearType);
    List<GearType> getAllGearTypes();
    GearType getGearByName(String name);
}
