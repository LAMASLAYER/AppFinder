DROP TABLE IF EXISTS WEALTH;
CREATE TABLE WEALTH
(
 WEALTH_ID INT NOT NULL,
  GOLD_AMNT INT NOT NULL,
  SILVER_AMNT INT NOT NULL,
  COPPER_AMNT INT NOT NULL,
  PRIMARY KEY (WEALTH_ID)
);
  INSERT INTO WEALTH VALUES(
                     1, 10, 10, 10
      )