package com.appfinder.data.chars;

import java.util.ArrayList;
import java.util.List;

import com.appfinder.components.characters.Characters;
import com.appfinder.components.charclasses.CharClass;
import com.appfinder.components.chargear.CharGear;
import com.appfinder.components.charspells.CharSpell;
import com.appfinder.components.classes.Classes;
import com.appfinder.components.gear.Gear;
import com.appfinder.components.races.Races;
import com.appfinder.components.racestraits.RacesTraits;
import com.appfinder.components.spells.Spells;
import com.appfinder.data.classlevels.ClassLevels;
import org.apache.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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

        ResponseEntity<List<RacesTraits>> res1 = restTemplate.exchange( uri + "/racesTraits/raceId/" + character.getRaceId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<RacesTraits>>(){});
        List<RacesTraits> racesTraits = res1.getBody();
        newChar.setRaceTraits(racesTraits);

        ResponseEntity<List<CharGear>> res2 = restTemplate.exchange( uri + "/charGear/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharGear>>(){});
        List<CharGear> charGear = res2.getBody();
        StringBuilder tempIds = new StringBuilder();
        for (int i = 0; i < charGear.size(); i++) {
            tempIds.append(charGear.get(i).getGearId()).append(",");
        }
            String gearIds;
            gearIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Gear>> res3 = restTemplate.exchange( uri + "/gear/charGear/" + gearIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Gear>>(){});
        List<Gear> gear = res3.getBody();
        newChar.setGear(gear);

        ResponseEntity<List<CharClass>> res4 = restTemplate.exchange( uri + "/charClass/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharClass>>(){});
        List<CharClass> charClass = res4.getBody();
        tempIds.delete(0, tempIds.length());
        for (int j = 0; j < charClass.size(); j++) {
            tempIds.append(charClass.get(j).getClassId()).append(",");
        }
        String classIds;
        classIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Classes>> res5 = restTemplate.exchange( uri + "/classes/charClasses/" + classIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Classes>>(){});
        List<Classes> classes = res5.getBody();
        newChar.setClasses(classes);

        ClassLevels classLevels = new ClassLevels();
        List<ClassLevels> tempLevels = new ArrayList<>(charClass.size());
        for (int k = 0; k < charClass.size(); k++) {
            classLevels.setClassId(charClass.get(k).getClassId());
            classLevels.setClassLevel(charClass.get(k).getClassLevel());
            tempLevels.add(k, classLevels);
        }
        newChar.setClassLevels(tempLevels);

        ResponseEntity<List<CharSpell>> res6 = restTemplate.exchange( uri + "/charSpell/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharSpell>>(){});
        List<CharSpell> charSpell = res6.getBody();
        tempIds.delete(0, tempIds.length());
        for (int l = 0; l < charClass.size(); l++) {
            tempIds.append(charClass.get(l).getClassId()).append(",");
        }
        String spellIds;
        spellIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Spells>> res7 = restTemplate.exchange( uri + "/spells/charSpell/" + spellIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Spells>>(){});
        List<Spells> spells = res7.getBody();
        newChar.setSpells(spells);

        return newChar;
    }


}
