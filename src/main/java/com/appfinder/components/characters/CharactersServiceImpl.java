package com.appfinder.components.characters;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharactersServiceImpl implements CharactersService {

    private static final Logger LOGGER = Logger.getLogger(CharactersController.class);

    private final CharactersRepository charactersRepository;

    @Autowired
    public CharactersServiceImpl(CharactersRepository charactersRepository) {
        this.charactersRepository = charactersRepository;
    }

    @Override
    public Characters getCharacterById(Integer charId) {
        return charactersRepository.findOne(charId);
    }

    @Override
    public void saveCharacter(Characters character) {
        charactersRepository.save(character);
    }

    @Override
    public List<Characters> getAllCharacters() {
        return charactersRepository.findAll();
    }

    @Override
    public List<Characters> getCharactersByPlayerId(int playerId) {
        return charactersRepository.findByPlayerId(playerId);
    }



}
