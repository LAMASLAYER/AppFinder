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
