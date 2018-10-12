package com.appfinder.data.tables.abilitymodifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ModifierTableServiceImpl implements ModifierTableService {


    private final ModifierTableRepository modifierTableRepository;

    @Autowired
    public ModifierTableServiceImpl(ModifierTableRepository modifierTableRepository) {
        this.modifierTableRepository = modifierTableRepository;
    }

    @Override
    public int getById(int modifierTableId) {
        return modifierTableRepository.findByModifierTableId(modifierTableId);
    }

}
