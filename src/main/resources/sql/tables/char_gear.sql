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