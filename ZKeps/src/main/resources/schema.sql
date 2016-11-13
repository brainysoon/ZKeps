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

INSERT INTO keper
VALUES ('user1', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user2', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user3', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user4', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user5', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user6', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user7', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user8', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user9', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user10', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user12', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user13', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user14', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user15', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user16', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user17', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user18', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user19', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);
INSERT INTO keper
VALUES ('user20', 'userpasswd1', 'test@coolbhu.cn', 'usertest', 'nomotto', '/var/local/avators/test.jpg', 0, 0);

DROP TABLE IF EXISTS keps;

CREATE TABLE keps (
  kepId      VARCHAR(20) NOT NULL PRIMARY KEY,
  userName   VARCHAR(16) NOT NULL,
  kepTime    DATE        NOT NULL,
  kepTitle   VARCHAR(30),
  kepMsg     VARCHAR(300),
  kepContent VARCHAR(1000),
  stars      INTEGER
);

INSERT INTO keps
VALUES ('201611131103324001', 'user1', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324002', 'user2', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324003', 'user3', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324004', 'user4', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324005', 'user5', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324006', 'user6', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324007', 'user7', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324008', 'user8', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324009', 'user9', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324010', 'user10', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324011', 'user11', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324012', 'user12', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324013', 'user13', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324014', 'user14', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324015', 'user15', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324016', 'user16', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324017', 'user17', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324018', 'user18', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO keps
VALUES ('201611131103324019','user19','2016-11-13','testTitle','kepmsg','nocontent',0);
INSERT INTO keps
VALUES ('201611131103324020','user20','2016-11-13','testTitle','kepmsg','nocontent',0);