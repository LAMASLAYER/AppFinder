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
import com.appfinder.components.players.Players;
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

import static com.appfinder.utils.Utils.SERVER;


@Service
public class CharacterServiceImpl implements CharacterService {

    private static final Logger LOGGER = Logger.getLogger(CharacterController.class);
    private Character newChar = new Character();




    @Override
    public Character buildChar(Integer charId) {
        LOGGER.info("Cool ! I'm building char " + charId);
        RestTemplate restTemplate = new RestTemplate();

        Characters character = restTemplate.getForObject(SERVER + "/characters/charId/" + charId, Characters.class);
        newChar.setCharId(character.getCharId());
        newChar.setCampaignId(character.getCampaignId());
        newChar.setCampaignCredentials(character.getCampaignCredentials());
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

        Players player = restTemplate.getForObject(SERVER + "/players/playerId/" + character.getPlayerId(), Players.class);
        newChar.setPlayerName(player.getName());

        Races charRace = restTemplate.getForObject(SERVER + "/races/raceId/" + character.getRaceId(), Races.class);
        newChar.setRace(charRace.getName());

        ResponseEntity<List<RacesTraits>> res1 = restTemplate.exchange( SERVER + "/racesTraits/raceId/" + character.getRaceId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<RacesTraits>>(){});
        List<RacesTraits> racesTraits = res1.getBody();
        newChar.setRaceTraits(racesTraits);

        ResponseEntity<List<CharGear>> res2 = restTemplate.exchange( SERVER + "/charGear/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharGear>>(){});
        List<CharGear> charGear = res2.getBody();
        StringBuilder tempIds = new StringBuilder();
        for (CharGear gear : charGear) {
            tempIds.append(gear.getGearId()).append(",");
        }
            String gearIds;
            gearIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Gear>> res3 = restTemplate.exchange( SERVER + "/gear/charGear/" + gearIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Gear>>(){});
        List<Gear> gear = res3.getBody();
        newChar.setGear(gear);

        String classIds;
        classIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Classes>> res5 = restTemplate.exchange( SERVER + "/classes/charClasses/" + classIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Classes>>(){});
        List<Classes> classes = res5.getBody();
        CharClass charClass;
        for (Classes _class : classes){
            charClass = restTemplate.getForObject(SERVER + "/charClass/charId/" + character.getCharId() + "/classId/" + _class.getClassId(), CharClass.class);
            _class.setLevel(charClass.getClassLevel());
            _class.setCasterLevel(charClass.getCasterLevel());
        }

        newChar.setClasses(classes);

        ResponseEntity<List<CharSpell>> res6 = restTemplate.exchange( SERVER + "/charSpell/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharSpell>>(){});
        List<CharSpell> charSpell = res6.getBody();
        tempIds.delete(0, tempIds.length());
        for (CharSpell spell : charSpell) {
            tempIds.append(spell.getSpellId()).append(",");
        }
        String spellIds;
        spellIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Spells>> res7 = restTemplate.exchange( SERVER + "/spells/charSpell/" + spellIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Spells>>(){});
        List<Spells> spells = res7.getBody();
        newChar.setSpells(spells);

        ResponseEntity<List<CharSkills>> res8 = restTemplate.exchange( SERVER + "/charSkill/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharSkills>>(){});
        List<CharSkills> charSkill = res8.getBody();
        tempIds.delete(0, tempIds.length());
        for (CharSkills skill : charSkill) {
            tempIds.append(skill.getSkillId()).append(",");
        }
        String skillIds;
        skillIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Skills>> res9 = restTemplate.exchange( SERVER + "/skills/charSkill/" + skillIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Skills>>(){});
        List<Skills> skills = res9.getBody();
        newChar.setSkills(skills);

        ResponseEntity<List<CharFeats>> res10 = restTemplate.exchange( SERVER + "/charFeat/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharFeats>>(){});
        List<CharFeats> charFeat = res10.getBody();
        tempIds.delete(0, tempIds.length());
        for (CharFeats feat : charFeat) {
            tempIds.append(feat.getFeatId()).append(",");
        }
        String featIds;
        featIds = tempIds.substring(0, tempIds.length() - 1);

        ResponseEntity<List<Feats>> res11 = restTemplate.exchange( SERVER + "/feats/charFeat/" + featIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Feats>>(){});
        List<Feats> feats = res11.getBody();
        newChar.setFeats(feats);

        CharWealth charWealth = restTemplate.getForObject(SERVER + "/charWealth/charId/" + character.getCharId(), CharWealth.class);
        LOGGER.info(charWealth.getWealthId());
        Wealth wealth = restTemplate.getForObject(SERVER + "/wealth/wealthId/" + charWealth.getWealthId(), Wealth.class);

        newChar.setWealth(wealth);

        ResponseEntity<List<CharAbilities>> res12 = restTemplate.exchange( SERVER + "/charAbilities/charId/" + character.getCharId(),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CharAbilities>>(){});
        List<CharAbilities> charAbilities = res12.getBody();
        tempIds.delete(0, tempIds.length());
        for (CharAbilities ability : charAbilities) {
            tempIds.append(ability.getAbilityId()).append(",");
        }
        String abilitiesIds;
        abilitiesIds = tempIds.substring(0, tempIds.length() - 1);
        ResponseEntity<List<Abilities>> res13 = restTemplate.exchange( SERVER + "/abilities/charAbilities/" + abilitiesIds,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Abilities>>(){});
        List<Abilities> abilities = res13.getBody();
        CharAbilities charAbility;
        Integer modifier;
        for (Abilities ability : abilities) {
            charAbility = restTemplate.getForObject(SERVER + "/charAbilities/abilityId/" + ability.getAbilityId(), CharAbilities.class);
            ability.setValue(charAbility.getAbilityValue());
            modifier = restTemplate.getForObject(SERVER + "/modifierTable/modifierTableId/" + charAbility.getAbilityValue(), Integer.class);
            ability.setModifier(charAbility.getAbilityValue() + modifier);
        }

        newChar.setAbilities(abilities);
        return newChar;
    }


}
