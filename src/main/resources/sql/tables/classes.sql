DROP TABLE IF EXISTS CLASSES;
CREATE TABLE CLASSES
(
  CLASS_ID INT NOT NULL UNIQUE AUTO_INCREMENT,
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
            0
           );
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
/*wizard */