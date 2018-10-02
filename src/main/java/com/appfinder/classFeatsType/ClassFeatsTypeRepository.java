package com.appfinder.classFeatsType;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassFeatsTypeRepository extends JpaRepository<ClassFeatsType, Integer> {
    public ClassFeatsType findByName(String name);
    public ClassFeatsType findByShortName(String shortNm);
}
