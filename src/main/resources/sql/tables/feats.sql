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