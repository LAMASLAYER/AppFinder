package com.appfinder.components.geartype;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GearTypeRepository extends JpaRepository<GearType, Integer> {
    GearType findByName(String name);
}
