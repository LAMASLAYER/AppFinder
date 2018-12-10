DROP TABLE IF EXISTS ABILITIES;
CREATE TABLE ABILITIES
(
  ABILITY_ID SERIAL,
  NAME VARCHAR(64) NOT NULL,
  SHORT_NM VARCHAR(3) NOT NULL,
  DESCRIPTION VARCHAR(255),
  VALUE INT NOT NULL,
  MODIFIER INT NOT NULL,
  BONUS INT NOT NULL,
  PENALTY INT NOT NULL,
  PRIMARY KEY (ABILITY_ID)
);

/*INSERT ABILITIES*/

INSERT INTO ABILITIES
VALUES (1, 'STRENGTH', 'STR', 'Strength of the character', 0, 0, 0, 0);
INSERT INTO ABILITIES
VALUES (2, 'STAMINA', 'STA', 'Stamina of the character', 0, 0, 0, 0);
INSERT INTO ABILITIES
VALUES (3, 'CONSTITUTION', 'CON', 'Constitution of the character', 0, 0, 0, 0);
INSERT INTO ABILITIES
VALUES (4, 'INTELLIGENCE', 'INT', 'Intelligence of the character', 0, 0, 0, 0);
INSERT INTO ABILITIES
VALUES (5, 'WISDOM', 'Wis', 'Wisdom of the character', 0, 0, 0, 0);
INSERT INTO ABILITIES
VALUES (6, 'CHARISMA', 'CHA', 'Charisma of the character', 0, 0, 0, 0);
/* LAST VALUES MUST ALWAYS BE 0. THEY ARE SET IN THE CHAR BUILDER */


DROP TABLE IF EXISTS ASSETS;
CREATE TABLE ASSETS
(
  ASSET_ID SERIAL,
  URL VARCHAR(255) NOT NULL,
  CATEGORY VARCHAR(64),
  PRIMARY KEY (ASSET_ID)
);


INSERT INTO ASSETS
VALUES (2, 'this is an url', 'CATEGORYTEST');

DROP TABLE IF EXISTS CAMPAIGNS;
CREATE TABLE CAMPAIGNS
(
  CAMPAIGN_ID SERIAL,
  NAME VARCHAR(64) NOT NULL,
  GM_ID INT NOT NULL,
  PRIMARY KEY (CAMPAIGN_ID)
);


INSERT INTO CAMPAIGNS
VALUES (2, 'L éveil du seigneur des runes', 1);

DROP TABLE IF EXISTS CHAR_ABILITIES;
CREATE TABLE CHAR_ABILITIES
(
  CHAR_ABILITY_ID SERIAL,
  CHAR_ID INT NOT NULL,
  ABILITY_ID INT NOT NULL,
  ABILITY_VALUE INT NOT NULL,
  PRIMARY KEY (CHAR_ABILITY_ID)
);

/*
INSERT THIS FOR A TEST CHAR_CLASS
*/

INSERT INTO CHAR_ABILITIES
VALUES (1, 1, 1, 15);
/*15 of strength*/

INSERT INTO CHAR_ABILITIES
VALUES (2, 1, 2, 15);
/*15 of stamina*/
DROP TABLE IF EXISTS CHAR_CLASS;
CREATE TABLE CHAR_CLASS
(
  CHAR_CLASS_ID SERIAL,
  CHAR_ID INT NOT NULL,
  CLASS_ID INT NOT NULL,
  CLASS_LEVEL INT NOT NULL,
  CASTER_LEVEL INT,
  PRIMARY KEY (CHAR_CLASS_ID)
);

/*
INSERT THIS FOR A TEST CHAR_CLASS
*/

INSERT INTO CHAR_CLASS
VALUES (1, 1, 1, 1, 1);
/*wizard lvl 1 caster lvl 1*/

INSERT INTO CHAR_CLASS
VALUES (2, 1, 2, 1, 1);
/*wizard lvl 1 caster lvl 1*/
DROP TABLE IF EXISTS CHAR_FEATS;
CREATE TABLE CHAR_FEATS
(
  CHAR_FEAT_ID SERIAL,
  CHAR_ID INT NOT NULL,
  FEAT_ID INT NOT NULL,
  PRIMARY KEY (CHAR_FEAT_ID)
);

/*
INSERT THIS FOR A TEST CHAR_GEAR
*/

INSERT INTO CHAR_FEATS
VALUES (1, 1, 1);
/*climb*/

DROP TABLE IF EXISTS CHAR_GEAR;
CREATE TABLE CHAR_GEAR
(
  CHAR_GEAR_ID SERIAL,
  CHAR_ID INT NOT NULL,
  GEAR_ID INT NOT NULL,
  PRIMARY KEY (CHAR_GEAR_ID)
);

/*
INSERT THIS FOR A TEST CHAR_GEAR
*/

INSERT INTO CHAR_GEAR
VALUES (1, 1, 1);
/*ultimate beatdown*/

INSERT INTO CHAR_GEAR
VALUES (2, 1, 2);
/*underwear of power*/
DROP TABLE IF EXISTS CHAR_SKILLS;
CREATE TABLE CHAR_SKILLS
(
  CHAR_SKILL_ID SERIAL,
  CHAR_ID INT NOT NULL,
  SKILL_ID INT NOT NULL,
  RANK INT NOT NULL,
  PRIMARY KEY (CHAR_SKILL_ID)
);

/*
INSERT THIS FOR A TEST CHAR_SKILL
*/

INSERT INTO CHAR_SKILLS
VALUES (1, 1, 1, 0);
/*MASSIVE DEATH*/
DROP TABLE IF EXISTS CHAR_SPELL;
CREATE TABLE CHAR_SPELL
(
  CHAR_SPELL_ID SERIAL,
  CHAR_ID INT NOT NULL,
  SPELL_ID INT NOT NULL,
  PRIMARY KEY (CHAR_SPELL_ID)
);

/*
INSERT THIS FOR A TEST CHAR_SPELL
*/

INSERT INTO CHAR_SPELL
VALUES (1, 1, 1);
/*MASSIVE DEATH*/
DROP TABLE IF EXISTS CHAR_WEALTH;
CREATE TABLE CHAR_WEALTH
(
  CHAR_WEALTH_ID SERIAL,
  CHAR_ID INT UNIQUE NOT NULL,
  WEALTH_ID INT UNIQUE NOT NULL,
  PRIMARY KEY (CHAR_WEALTH_ID)
);

/*
INSERT THIS FOR A TEST CHAR_WEALTH
*/

INSERT INTO CHAR_WEALTH
VALUES (1, 1, 1);
INSERT INTO CHAR_WEALTH
VALUES (2, 2, 2);

DROP TABLE IF EXISTS CHARACTERS;
CREATE TABLE CHARACTERS
(
  CHAR_ID SERIAL,
  RACE_ID INT NOT NULL,
  PLAYER_ID INT NOT NULL,
  CAMPAIGN_ID INT NOT NULL,
  CAMPAIGN_CREDENTIALS INT NOT NULL,
  AGE INT NOT NULL,
  GENDER CHAR(1) NOT NULL,
  NAME VARCHAR(255) NOT NULL,
  LEVEL INT NOT NULL,
  ALIGNMENT VARCHAR(64),
  DEITY VARCHAR(64),
  HEIGHT INT NOT NULL,
  HEIGHT_UNIT VARCHAR(5),
  WEIGHT INT NOT NULL,
  WEIGHT_UNIT VARCHAR(5),
  CREATION_DATE TIMESTAMP,
  PRIMARY KEY (CHAR_ID)
);

/*
INSERT THIS FOR A TEST CHARACTER
WARNING: RACE INSERT SHOULD BE DONE BEFORE. SEE RACES.SQL
*/

INSERT INTO characters
VALUES (
           1,
           1,
           1,
           1,
           1,
           34,
           'M',
           'Bobby',
           1,
           'Chaotic',
           null,
           176,
           'cm',
           92,
           'kg',
           CURRENT_TIMESTAMP
           );

DROP TABLE IF EXISTS CLASS_FEATS;
CREATE TABLE CLASS_FEATS
(
  CLASS_FEAT_ID SERIAL,
  CLASS_ID INT NOT NULL,
  FEAT_ID INT NOT NULL,
  PRIMARY KEY (CLASS_FEAT_ID)
);

/*
INSERT THIS FOR A TEST CLASS FEAT
*/

INSERT INTO CLASS_FEATS
VALUES (1, 1, 1);
/*stunning fist*/

DROP TABLE IF EXISTS CLASS_SKILLS;
CREATE TABLE CLASS_SKILLS
(
  CLASS_SKILL_ID SERIAL,
  SKILL_ID INT NOT NULL,
  CLASS_ID INT NOT NULL,
  PRIMARY KEY (CLASS_SKILL_ID)
);

/*
INSERT THIS FOR A TEST CLASS SKILL
*/

INSERT INTO CLASS_SKILLS
VALUES (1, 1, 1);

DROP TABLE IF EXISTS CLASSES;
CREATE TABLE CLASSES
(
  CLASS_ID SERIAL,
  NAME VARCHAR(32) UNIQUE NOT NULL,
  ALIGNMENT VARCHAR(32) NOT NULL,
  HIT_DIE INT NOT NULL,
  STARTING_WEALTH VARCHAR(32) NOT NULL,
  SKILLS_PER_LEVEL INT NOT NULL,
  LEVEL INT,
  CASTER_LEVEL INT,
  PRIMARY KEY (CLASS_ID)
);

/*
INSERT THIS FOR TEST CLASS
 */

INSERT INTO CLASSES
VALUES (
           1,
           'Wizard',
           'Any',
           6,
           '2D6 x 10gp',
           2,
           0,
           0);
/*wizard */

INSERT INTO CLASSES
VALUES (
          2,
          'Bard',
          'Any',
          6,
          '2D6 x 10gp',
          2,
          0,
          0
          );
/* LAST TWO VALUES MUST ALWAYS BE 0. THEY ARE SET IN THE CHAR BUILDER ! */

DROP TABLE IF EXISTS FEATS;
CREATE TABLE FEATS
(
  FEAT_ID SERIAL,
  NAME VARCHAR(64) NOT NULL,
  DESCRIPTION VARCHAR(1000),
  SPECIAL VARCHAR(255),
  TYPE VARCHAR(16),
  PRIMARY KEY (FEAT_ID)
);

/*
INSERT THIS FOR A TEST FEAT
*/

INSERT INTO FEATS
VALUES (1,
        'Draconic Magic',
        'You gain a group of spell-like abilities based on the color of your dragon aspect. Each spell-like ability can be used once per day, and the DC of any of these spell-like abilities is 10 + 1/2 your Hit Dice + Charisma modifier.',
        'You can use this feat instead of Draconic Breath or Draconic Glide to qualify for the Draconic Paragon feat. If you have this feat and Draconic Paragon, you can use the spell-like ability marked with a dagger (†) twice per day.',
        null
           );

DROP TABLE IF EXISTS GEAR;
CREATE TABLE GEAR
(
  GEAR_ID SERIAL,
  NAME VARCHAR(64) NOT NULL,
  TYPE_ID INT, /*TABLE GEAR_TYPE*/
  MODIFIER INT, /* EXAMPLE +2 TO...*/
  ABILITY_ID INT, /* TABLE ABILITIES */
  DESCRIPTION VARCHAR(1000),
  PRICE int,
  CURRENCY_ID int, /* TABLE CURRENCY */
  WEIGHT int,
  WEIGHT_UNIT VARCHAR(4),
  DMG_SMALL VARCHAR(16),
  DMG_MIDDLE VARCHAR(16),
  CRITICAL VARCHAR(16),
  ITEM_RANGE VARCHAR(16),
  SPECIAL VARCHAR(255),
  PRIMARY KEY (GEAR_ID)
);

/*
INSERT THIS FOR A TEST GEAR
*/

INSERT INTO GEAR
VALUES (1, 'THE ULTIMATE BEATDOWN', 1, 1000000, 1, 'Kills anything in 1 hit.', 999999, 1, 1, 'kg', '1000d20', '1000d20', 'x9999', null, null);

INSERT INTO GEAR
VALUES (2, 'The underwear of strength', 1, 1000000, 1, 'An underwear that makes you strong', null, 1, 1, 'kg', null, null, null, null, null);

DROP TABLE IF EXISTS MODIFIER_TABLE;
CREATE TABLE MODIFIER_TABLE
(
  MODIFIER_TABLE_ID SERIAL,
  MATRIX_VALUE INT NOT NULL,
  PRIMARY KEY (MODIFIER_TABLE_ID)
);

/*
This is a matrix for computing modifier. It's not meant to be changed ! EVER.
*/
DROP TABLE IF EXISTS PLAYERS;
CREATE TABLE PLAYERS
(
  PLAYER_ID SERIAL,
  NAME VARCHAR(32) NOT NULL,
  PASSWORD VARCHAR(32) NOT NULL,
  EMAIL VARCHAR(64) UNIQUE NOT NULL,
  CREDENTIALS INT NOT NULL,
  CREATION_DATE TIMESTAMP,
  PRIMARY KEY (PLAYER_ID)
);

/*
INSERT THIS FOR TEST PLAYER
*/

INSERT INTO PLAYERS
VALUES (
           1,
           'Jerome',
           '1234',
           'mymail',
           1,
           CURRENT_TIMESTAMP
           );
DROP TABLE IF EXISTS RACES;
CREATE TABLE RACES
(
  RACE_ID SERIAL,
  NAME VARCHAR(32) UNIQUE NOT NULL,
  SIZE VARCHAR(3) NOT NULL,
  PRIMARY KEY (RACE_ID)
);

/*
INSERT THIS FOR TEST RACE
 */

INSERT INTO races
VALUES (
           1,
           'Humain',
           'M'
           );
DROP TABLE IF EXISTS RACES_TRAITS;
CREATE TABLE RACES_TRAITS
(
  RACE_TRAIT_ID SERIAL,
  RACE_ID INT NOT NULL,
  NAME VARCHAR (255),
  DESCRIPTION VARCHAR(1000),
  MODIFIER INT, /* EXAMPLE +2 TO...*/
  ABILITY_ID INT, /* TABLE ABILITIES */
  PRIMARY KEY (RACE_TRAIT_ID)
);

/*
INSERT THIS FOR A TEST RACE TRAIT
*/

INSERT INTO RACES_TRAITS
VALUES (2,
        1,
        'Ability Score Racial Traits', 'Human characters gain a +2 racial bonus to one ability score of their choice at creation to represent their varied nature.',
        2,
        null);
DROP TABLE IF EXISTS SKILLS;
CREATE TABLE SKILLS
(
  SKILL_ID SERIAL,
  NAME VARCHAR(64) NOT NULL,
  PRIMARY_STAT VARCHAR(3) NOT NULL,
  DESCRIPTION VARCHAR(255),
  PRIMARY KEY (SKILL_ID)
);

/*
INSERT SKILLS
*/

INSERT INTO SKILLS
VALUES (1, 'CLIMB', 'STR', 'Ability to climb walls/cliffs/other');
VALUES (2, 'ACROBATICS', 'DEX', 'You can keep your balance while traversing narrow or treacherous surfaces. You can also dive, flip, jump, and roll, avoiding attacks and confusing your opponents.');
VALUES (3, 'APPRAISE', 'INT', 'You can evaluate the monetary value of an object.');
VALUES (4, 'BLUFF', 'CHA', 'You know how to tell a lie.');
VALUES (5, 'CRAFT', 'INT', 'You are skilled in the creation of a specific group of items.');
VALUES (6, 'DIPLOMACY', 'CHA', 'You can use this skill to persuade others to agree with your arguments, to resolve differences, and to gather valuable information or rumors from people.');
VALUES (7, 'DISABLE DEVICE', 'DEX', 'You are skilled at disarming traps and opening locks. In addition, this skill lets you sabotage simple mechanical devices, such as catapults, wagon wheels, and doors.');
VALUES (8, 'DISGUISE', 'CHA', 'You are skilled at changing your appearance.');
VALUES (9, 'ESCAPE ARTIST', 'DEX', 'Your training allows you to slip bonds and escape from grapples.');
VALUES (10, 'FLY', 'DEX', 'You are skilled as flying.');
VALUES (11, 'HANDLE ANIMAL', 'CHA', 'You are trained at working with animals, and can teach them tricks, get them to follow your simple commands, or even domesticate them.');
VALUES (12, 'HEAL', 'WIS', 'You are skilled at tending to the ailments of others.');
VALUES (13, 'INTIMIDATE ', 'CHA', 'You can use this skill to frighten your opponents or to get them to act in a way that benefits you. This skill includes verbal threats and displays of prowess.');
VALUES (14, 'KNOWLEDGE(ARCANA)', 'INT', 'ancient mysteries, magic traditions, arcane symbols, constructs, dragons, magical beasts); Although robots are constructs, Knowledge (arcana) cannot be used to identify robots or their abilities and weaknesses.');
VALUES (15, 'KNOWLEDGE(DUNGEONEERING)', 'INT', 'aberrations, caverns, oozes, spelunking.');
VALUES (16, 'KNOWLEDGE(ENGINEERING)', 'INT', 'buildings, aqueducts, bridges, fortifications; This is the most important skill with regard to technological subjects.');
VALUES (17, 'KNOWLEDGE(HISTORY)', 'INT', 'wars, colonies, migrations, founding of cities');
VALUES (18, 'KNOWLEDGE(LOCAL)', 'INT', 'egends, personalities, inhabitants, laws, customs, traditions, humanoids');
VALUES (19, 'KNOWLEDGE(NATURE)', 'INT', 'animals, fey, monstrous humanoids, plants, seasons and cycles, weather, vermin');
VALUES (20, 'KNOWLEDGE(NOBILITY)', 'INT', 'lineages, heraldry, personalities, royalty');
VALUES (21, 'KNOWLEDGE(PLANES)', 'INT', 'the Inner Planes, the Outer Planes, the Astral Plane, the Ethereal Plane, outsiders, planar magic');
VALUES (22, 'KNOWLEDGE(RELIGION)', 'INT', 'gods and goddesses, mythic history, ecclesiastic tradition, holy symbols, undead');
VALUES (23, 'KNOWLEDGE(GEOGRAPHY)', 'INT', 'Used for astronomy.');
VALUES (24, 'LINGUISTICS', 'INT', 'You are skilled at working with language, in both its spoken and written forms. ');
VALUES (25, 'PERCEPTION', 'WIS', 'Your senses allow you to notice fine details and alert you to danger. Perception covers all five senses, including sight, hearing, touch, taste, and smell.');
VALUES (26, 'PERFORM', 'CHA', 'You are skilled at one form of entertainment, from singing to acting to playing an instrument.');
VALUES (27, 'PROFESSION', 'WIS', 'You are skilled at a specific job.');
VALUES (28, 'RIDE', 'DEX', 'You are skilled at riding mounts, usually a horse, but possibly something more exotic, like a griffon or pegasus.');
VALUES (29, 'SENSE MOTIVE', 'WIS', 'You are skilled at detecting falsehoods and true intentions.');
VALUES (30, 'SLEIGHT OF HAND', 'DEX', 'Your training allows you to pick pockets, draw hidden weapons, and take a variety of actions without being noticed.');
VALUES (31, 'SPELLCRAFT', 'INT', 'You are skilled at the art of casting spells, identifying magic items, crafting magic items, and identifying spells as they are being cast.');
VALUES (32, 'STEALTH', 'DEX', 'You are skilled at avoiding detection, allowing you to slip past foes or strike from an unseen position. This skill covers hiding and moving silently.');
VALUES (33, 'SURVIVAL', 'WIS', 'You are skilled at surviving in the wild and at navigating in the wilderness. You also excel at following trails and tracks left by others.');
VALUES (34, 'SWIM', 'STR', 'You know how to swim and can do so even in stormy water.');
VALUES (35, 'USE MAGIC DEVICE', 'CHA', 'You are skilled at activating magic items, even if you are not otherwise trained in their use.');


DROP TABLE IF EXISTS SPELLS;
CREATE TABLE SPELLS
(
  SPELL_ID SERIAL,
  NAME VARCHAR(64) NOT NULL,
  DESCRIPTION VARCHAR(1000),
  DAMAGES VARCHAR(16),
  ATTACK_RANGE VARCHAR(32),
  DURATION VARCHAR(32),
  SAVING_THROW VARCHAR(64),
  CASTING_TIME VARCHAR(64),
  TARGET VARCHAR(64),
  SCHOOL VARCHAR(64),
  LEVEL INT,
  CASTER_CLASS VARCHAR(64),
  SPELL_RESISTANCE VARCHAR(3),
  DOMAIN VARCHAR(16),
  SUB_DOMAIN VARCHAR(16),
  COMPONENTS VARCHAR(16),
  PRIMARY KEY (SPELL_ID)
);

/*
INSERT THIS FOR A TEST SPELL
*/

INSERT INTO SPELLS
VALUES (1,
        'MASSIVE DEATH',
        'Kills anybody within 100m',
        '/',
        '100m',
        'INSTANTANEOUS',
        'NO',
        '1 standard action',
        'Anybody in the zone',
        'Death',
        9999,
        'NECROMANCER',
        'No',
        'Death',
        null,
        'VS'
           );
DROP TABLE IF EXISTS WEALTH;
CREATE TABLE WEALTH
(
  WEALTH_ID INT NOT NULL,
  GOLD_AMNT INT NOT NULL,
  SILVER_AMNT INT NOT NULL,
  COPPER_AMNT INT NOT NULL,
  PRIMARY KEY (WEALTH_ID)
);
INSERT INTO WEALTH VALUES(
                             1, 10, 10, 10
                             )