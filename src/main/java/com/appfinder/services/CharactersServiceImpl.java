package com.appfinder.services;

import com.appfinder.models.Characters;
import com.appfinder.repositories.CharactersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharactersServiceImpl implements CharactersService {


    private final CharactersRepository charactersRepository;

    @Autowired
    public CharactersServiceImpl(CharactersRepository charactersRepository) {
        this.charactersRepository = charactersRepository;
    }

    @Override
    @Query("SELECT * FROM characters c WHERE c.id=?#{id}")
    public Characters getCharacterById(Integer char_id) {
        return charactersRepository.findOne(char_id);
    }

    @Override
    public void saveCharacter(Characters character) {
        charactersRepository.save(character);
    }

    @Override
    public List<Characters> getAllCharacters() {
        return charactersRepository.findAll();
    }

}
