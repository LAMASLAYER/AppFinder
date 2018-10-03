package com.appfinder.components.gear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GearServiceImpl implements GearService {


    private final GearRepository gearRepository;

    @Autowired
    public GearServiceImpl(GearRepository gearRepository) {
        this.gearRepository = gearRepository;
    }

    @Override
    public Gear getGearById(Integer gearId) {
        return gearRepository.findOne(gearId);
    }

    @Override
    public void saveGear(Gear gear) {
        gearRepository.save(gear);
    }

    @Override
    public List<Gear> getAllGear() {
        return gearRepository.findAll();
    }

    @Override
    public Gear getGearByName(String name) { return gearRepository.findByName(name); }

    @Override
    public List<Gear> getGearByStat(int abilityId) { return gearRepository.findByAbilityId(abilityId); }

    @Override
    public List<Gear> getGearByType(int typeId) { return gearRepository.findByTypeId(typeId); }

}
