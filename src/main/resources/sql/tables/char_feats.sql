DROP TABLE IF EXISTS CHAR_FEATS;
CREATE TABLE CHAR_FEATS
(
  CHAR_FEAT_ID INT NOT NULL UNIQUE AUTO_INCREMENT,
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