DROP TABLE IF EXISTS CLASS_FEATS_TYPE;
CREATE TABLE CLASS_FEATS_TYPE
(
  CLASS_FEAT_TYPE_ID INT NOT NULL UNIQUE AUTO_INCREMENT,
  NAME VARCHAR (64),
  SHORT_NAME VARCHAR(2),
  DESCRIPTION VARCHAR(1000),
  PRIMARY KEY (CLASS_FEAT_TYPE_ID)
);

/*
INSERT THIS FOR A TEST CLASS FEAT TYPE
*/

INSERT INTO CLASS_FEATS_TYPE
VALUES (1,  'Extraordinary', 'EX', 'Extraordinary abilities are non-magical. They are, however, not something that just anyone can do or even learn to do without extensive training. Effects or areas that suppress or negate magic have no effect on extraordinary abilities.');
