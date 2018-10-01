package com.appfinder.gearType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GearTypeServiceImpl implements GearTypeService {


    private final GearTypeRepository gearTypeRepository;

    @Autowired
    public GearTypeServiceImpl(GearTypeRepository gearTypeRepository) {
        this.gearTypeRepository = gearTypeRepository;
    }

    @Override
    public GearType getByGearTypeId(Integer gearId) {
        return gearTypeRepository.findOne(gearId);
    }

    @Override
    public void saveGear(GearType gearType) {
        gearTypeRepository.save(gearType);
    }

    @Override
    public List<GearType> getAllGearTypes() {
        return gearTypeRepository.findAll();
    }

    @Override
    public GearType getGearByName(String name) { return gearTypeRepository.findByName(name); }

}
