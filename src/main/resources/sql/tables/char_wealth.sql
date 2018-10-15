DROP TABLE IF EXISTS CHAR_WEALTH;
CREATE TABLE CHAR_WEALTH
(
  CHAR_WEALTH_ID INT NOT NULL UNIQUE AUTO_INCREMENT,
  CHAR_ID INT UNIQUE NOT NULL,
  WEALTH_ID INT UNIQUE NOT NULL,
  PRIMARY KEY (CHAR_WEALTH_ID)
);

/*
INSERT THIS FOR A TEST CHAR_WEALTH
*/

INSERT INTO CHAR_WEALTH
VALUES (1, 1, 1);
INSERT INTO CHAR_WEALTH
VALUES (2, 2, 2);