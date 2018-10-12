package com.appfinder.data.tables.abilitymodifier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ModifierTableRepository extends JpaRepository<ModifierTable, Integer> {
    @Query(value = "SELECT MATRIX_VALUE FROM MODIFIER_TABLE WHERE MODIFIER_TABLE_ID=:id", nativeQuery = true)
    int findByModifierTableId(@Param("id") int modifierTableId);
}
