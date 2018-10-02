package com.appfinder.spells;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpellsServiceImpl implements SpellsService {


    private final SpellsRepository spellsRepository;

    @Autowired
    public SpellsServiceImpl(SpellsRepository spellsRepository) {
        this.spellsRepository = spellsRepository;
    }

    @Override
    public Spells getSpellById(Integer spellId) {
        return spellsRepository.findOne(spellId);
    }

    @Override
    public void saveSpell(Spells spell) {
        spellsRepository.save(spell);
    }

    @Override
    public List<Spells> getAllSpells() {
        return spellsRepository.findAll();
    }

    @Override
    public Spells getSpellByName(String name) { return spellsRepository.findByName(name); }

    @Override
    public List<Spells> getByClassAndLevel(String casterClass, Integer level) { return spellsRepository.findByCasterClassAndLevel(casterClass, level); }

    @Override
    public List<Spells> getByClass(String casterClass) { return spellsRepository.findByCasterClass(casterClass); }

    @Override
    public List<Spells> getByClassAndLevelLessThanEqual(String casterClass, Integer level) { return spellsRepository.findByCasterClassAndLevelLessThanEqual(casterClass, level); }

}
