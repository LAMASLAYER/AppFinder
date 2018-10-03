package com.appfinder.data.chars;

import java.util.List;
import com.appfinder.components.characters.Characters;
import com.appfinder.components.gear.Gear;
import com.appfinder.components.races.Races;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CharacterServiceImpl implements CharacterService {

    private static final Logger LOGGER = Logger.getLogger(CharacterController.class);
    private String uri = "http://localhost:8080";
    private Character newChar = new Character();




    @Override
    public Character buildChar(Integer charId) {
        LOGGER.info("Cool ! I'm building char " + charId);
        RestTemplate restTemplate = new RestTemplate();

        Characters character = restTemplate.getForObject(uri + "/characters/charId/" + charId, Characters.class);
        newChar.setCharId(character.getCharId());
        newChar.setAge(character.getAge());
        newChar.setGender(character.getGender());
        newChar.setAlignment(character.getAlignment());
        newChar.setDeity(character.getDeity());
        newChar.setHeight(character.getHeight());
        newChar.setHeightUnit(character.getHeightUnit());
        newChar.setLevel(character.getLevel());
        newChar.setWeight(character.getWeight());
        newChar.setWeightUnit(character.getWeightUnit());
        newChar.setName(character.getName());

        Races charRace = restTemplate.getForObject(uri + "/races/raceId/" + character.getRaceId(), Races.class);
        newChar.setRace(charRace.getName());

        return newChar;
    }


}
