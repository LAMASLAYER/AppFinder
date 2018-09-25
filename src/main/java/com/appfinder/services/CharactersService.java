package com.appfinder.services;

import com.appfinder.models.Characters;

import java.util.List;

public interface CharactersService {
    Characters getCharacterById(Integer char_id);
    void saveCharacter(Characters playersDto);
    List<Characters> getAllCharacters();
}
