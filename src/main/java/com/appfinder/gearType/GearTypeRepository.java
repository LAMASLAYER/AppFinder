package com.appfinder.gearType;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GearTypeRepository extends JpaRepository<GearType, Integer> {
    GearType findByName(String name);
}
