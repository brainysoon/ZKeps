DROP TABLE IF EXISTS keper;

CREATE TABLE keper (
  userName VARCHAR(16) NOT NULL UNIQUE PRIMARY KEY,
  password VARCHAR(16) NOT NULL,
  email    VARCHAR(30) NOT NULL,
  nickName VARCHAR(16),
  motto    VARCHAR(150),
  avator   VARCHAR(100),
  stars    INTEGER(4),
  slead    INTEGER(1)
);

CREATE TABLE keps (
  kepId      INTEGER     NOT NULL PRIMARY KEY,
  userName   VARCHAR(16) NOT NULL,
  kepTime    DATA        NOT NULL,
  kepTitle   VARCHAR(30),
  kepMsg     VARCHAR(300),
  kepContent VARCHAR(1000),
  stars      INTEGER
);