DROP TABLE IF EXISTS RACES_TRAITS;
CREATE TABLE RACES_TRAITS
(
  RACE_TRAIT_ID INT NOT NULL UNIQUE AUTO_INCREMENT,
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
VALUES (1,
        1,
        'Ability Score Racial Traits', 'Human characters gain a +2 racial bonus to one ability score of their choice at creation to represent their varied nature.',
        2,
        null);
