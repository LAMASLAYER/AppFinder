package com.appfinder.components.gear;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GearRepository extends JpaRepository<Gear, Integer> {
    Gear findByName(String name);
    List<Gear> findByAbilityId(int abilityId);
    List<Gear> findByTypeId(int typeId);
    List<Gear> findByGearIdIn(Integer[] ids);
}
