package com.appfinder.gear;


import java.util.List;

public interface GearService {
    Gear getGearById(Integer gearId);
    void saveGear(Gear gear);
    List<Gear> getAllGear();
    Gear getGearByName(String name);
    List<Gear> getGearByStat(int stat);
    List<Gear> getGearByType(int typeId);
}
