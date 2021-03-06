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
