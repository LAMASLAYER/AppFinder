DROP TABLE IF EXISTS CHAR_SKILLS;
CREATE TABLE CHAR_SKILLS
(
  CHAR_SKILL_ID SERIAL,
  CHAR_ID INT NOT NULL,
  SKILL_ID INT NOT NULL,
  PRIMARY KEY (CHAR_SKILL_ID)
);

/*
INSERT THIS FOR A TEST CHAR_SKILL
*/

INSERT INTO CHAR_SKILLS
VALUES (1, 1, 1);
/*MASSIVE DEATH*/