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
