package com.appfinder.components.charclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharClassServiceImpl implements CharClassService {


    private final CharClassRepository charClassRepository;

    @Autowired
    public CharClassServiceImpl(CharClassRepository charClassRepository) {
        this.charClassRepository = charClassRepository;
    }

    @Override
    public List<CharClass> getByCharId(Integer charId) {
        return charClassRepository.findByCharId(charId);
    }

    @Override
    public void saveCharClass(CharClass charClass) {
        charClassRepository.save(charClass);
    }

    @Override
    public  CharClass getByCharIdAndClassId(int charId, int classId) { return charClassRepository.findByCharIdAndAndClassId(charId, classId); }

}
