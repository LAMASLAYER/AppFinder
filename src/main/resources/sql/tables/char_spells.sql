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