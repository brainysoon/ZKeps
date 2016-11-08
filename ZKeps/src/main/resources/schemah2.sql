DROP TABLE IF EXISTS keper;

CREATE TABLE keper (
  userName VARCHAR(16) NOT NULL PRIMARY KEY,
  password VARCHAR(16) NOT NULL,
  email    VARCHAR(30) NOT NULL,
  nickName VARCHAR(16),
  motto    VARCHAR(150),
  avator   VARCHAR(100),
  stars    INTEGER,
  slead    INTEGER
);