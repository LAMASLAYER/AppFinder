package com.appfinder.characters;

import java.util.List;

public interface CharactersService {
    Characters getCharacterById(Integer charId);
    void saveCharacter(Characters character);
    List<Characters> getAllCharacters();
    List<Characters> getCharactersByPlayerId(int playerId);
}
