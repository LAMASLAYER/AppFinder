package com.appfinder.data.chars;

import java.util.List;

import com.appfinder.components.abilities.Abilities;
import com.appfinder.components.charabilities.CharAbilities;
import com.appfinder.components.characters.Characters;
import com.appfinder.components.charclasses.CharClass;
import com.appfinder.components.charfeats.CharFeats;
import com.appfinder.components.chargear.CharGear;
import com.appfinder.components.charskills.CharSkills;
import com.appfinder.components.charspells.CharSpell;
import com.appfinder.components.charwealth.CharWealth;
import com.appfinder.components.classes.Classes;
import com.appfinder.components.feats.Feats;
import com.appfinder.components.gear.Gear;
import com.appfinder.components.races.Races;
import com.appfinder.components.racestraits.RacesTraits;
import com.appfinder.components.skills.Skills;
import com.appfinder.components.spells.Spells;
import com.appfinder.components.wealth.Wealth;
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
        newChar.setCampaignId(character.getCampaignId());
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

        String classIds;
        classIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Classes>> res5 = restTemplate.exchange( uri + "/classes/charClasses/" + classIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Classes>>(){});
        List<Classes> classes = res5.getBody();
        CharClass charClass;
        for (int j = 0; j < classes.size(); j++){
            charClass = restTemplate.getForObject(uri + "/charClass/charId/" + character.getCharId() + "/classId/" + classes.get(j).getClassId(), CharClass.class);
            classes.get(j).setLevel(charClass.getClassLevel());
            classes.get(j).setCasterLevel(charClass.getCasterLevel());
        }

        newChar.setClasses(classes);

        ResponseEntity<List<CharSpell>> res6 = restTemplate.exchange( uri + "/charSpell/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharSpell>>(){});
        List<CharSpell> charSpell = res6.getBody();
        tempIds.delete(0, tempIds.length());
        for (int l = 0; l < charSpell.size(); l++) {
            tempIds.append(charSpell.get(l).getSpellId()).append(",");
        }
        String spellIds;
        spellIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Spells>> res7 = restTemplate.exchange( uri + "/spells/charSpell/" + spellIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Spells>>(){});
        List<Spells> spells = res7.getBody();
        newChar.setSpells(spells);

        ResponseEntity<List<CharSkills>> res8 = restTemplate.exchange( uri + "/charSkill/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharSkills>>(){});
        List<CharSkills> charSkill = res8.getBody();
        tempIds.delete(0, tempIds.length());
        for (int l = 0; l < charSkill.size(); l++) {
            tempIds.append(charSkill.get(l).getSkillId()).append(",");
        }
        String skillIds;
        skillIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Skills>> res9 = restTemplate.exchange( uri + "/skills/charSkill/" + skillIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Skills>>(){});
        List<Skills> skills = res9.getBody();
        newChar.setSkills(skills);

        ResponseEntity<List<CharFeats>> res10 = restTemplate.exchange( uri + "/charFeat/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharFeats>>(){});
        List<CharFeats> charFeat = res10.getBody();
        tempIds.delete(0, tempIds.length());
        for (int m = 0; m < charFeat.size(); m++) {
            tempIds.append(charFeat.get(m).getFeatId()).append(",");
        }
        String featIds;
        featIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Feats>> res11 = restTemplate.exchange( uri + "/feats/charFeat/" + featIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Feats>>(){});
        List<Feats> feats = res11.getBody();
        newChar.setFeats(feats);


        CharWealth charWealth = restTemplate.getForObject(uri + "/charWealth/charId/" + character.getCharId(), CharWealth.class);
        LOGGER.info(charWealth.getWealthId());
        Wealth wealth = restTemplate.getForObject(uri + "/wealth/wealthId/" + charWealth.getWealthId(), Wealth.class);

        newChar.setWealth(wealth);

        ResponseEntity<List<CharAbilities>> res12 = restTemplate.exchange( uri + "/charAbilities/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharAbilities>>(){});
        List<CharAbilities> charAbilities = res12.getBody();
        tempIds.delete(0, tempIds.length());
        for (int n = 0; n < charAbilities.size(); n++) {
            tempIds.append(charAbilities.get(n).getAbilityId()).append(",");
        }
        String abilitiesIds;
        abilitiesIds = tempIds.substring(0, tempIds.length() - 1);
        ResponseEntity<List<Abilities>> res13 = restTemplate.exchange( uri + "/abilities/charAbilities/" + abilitiesIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Abilities>>(){});
        List<Abilities> abilities = res13.getBody();
        CharAbilities charAbility;
        Integer modifier;
        for (int o = 0; o < abilities.size(); o++) {
            charAbility = restTemplate.getForObject(uri + "/charAbilities/abilityId/" + abilities.get(o).getAbilityId(), CharAbilities.class);
            abilities.get(o).setValue(charAbility.getAbilityValue());
            modifier = restTemplate.getForObject(uri + "/modifierTable/modifierTableId/" + charAbility.getAbilityValue(), Integer.class);
            abilities.get(o).setModifier(charAbility.getAbilityValue() + modifier);
        }



        newChar.setAbilities(abilities);
        return newChar;
    }


}
