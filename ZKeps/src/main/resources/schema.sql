DROP TABLE IF EXISTS keper;

CREATE TABLE keper (
  keperName VARCHAR(16) NOT NULL UNIQUE PRIMARY KEY,
  password  VARCHAR(16) NOT NULL,
  email     VARCHAR(30) NOT NULL,
  nickName  VARCHAR(16),
  motto     VARCHAR(150),
  avator    VARCHAR(100),
  stars     INTEGER,
  slead     TINYINT
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
INSERT INTO keper
VALUES ('brainy', 'bs19940115.', 'brainysoon@163.com', '聪聪小可爱', '走起', '/var/local/avators/brainy.jpg', 0, 1);

DROP TABLE IF EXISTS kep;

CREATE TABLE kep (
  kepId      VARCHAR(20) NOT NULL UNIQUE PRIMARY KEY,
  keperName  VARCHAR(16) NOT NULL,
  kepTime    DATETIME    NOT NULL,
  kepTitle   VARCHAR(30),
  kepMsg     VARCHAR(300),
  kepContent VARCHAR(1000),
  stars      INTEGER
);

INSERT INTO kep
VALUES ('201611131103324001', 'user1', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 4);
INSERT INTO kep
VALUES ('201611131103324002', 'user2', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 23);
INSERT INTO kep
VALUES ('201611131103324003', 'user3', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 123);
INSERT INTO kep
VALUES ('201611131103324004', 'user4', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 12);
INSERT INTO kep
VALUES ('201611131103324005', 'user5', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 4);
INSERT INTO kep
VALUES ('201611131103324006', 'user6', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 1);
INSERT INTO kep
VALUES ('201611131103324007', 'user7', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 3);
INSERT INTO kep
VALUES ('201611131103324008', 'user8', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 5);
INSERT INTO kep
VALUES ('201611131103324009', 'user9', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 6);
INSERT INTO kep
VALUES ('201611131103324010', 'user10', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent',7);
INSERT INTO kep
VALUES ('201611131103324011', 'user11', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 10);
INSERT INTO kep
VALUES ('201611131103324012', 'user12', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 12);
INSERT INTO kep
VALUES ('201611131103324013', 'user13', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 34);
INSERT INTO kep
VALUES ('201611131103324014', 'user14', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 34);
INSERT INTO kep
VALUES ('201611131103324015', 'user15', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 35);
INSERT INTO kep
VALUES ('201611131103324016', 'user16', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 53);
INSERT INTO kep
VALUES ('201611131103324017', 'user17', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 45);
INSERT INTO kep
VALUES ('201611131103324018', 'user18', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 67);
INSERT INTO kep
VALUES ('201611131103324019', 'user19', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 0);
INSERT INTO kep
VALUES ('201611131103324020', 'user20', '2016-11-13', 'testTitle', 'kepmsg', 'nocontent', 34);

DROP TABLE IF EXISTS comment;

CREATE TABLE comment (
  commentId VARCHAR(20) NOT NULL UNIQUE PRIMARY KEY,
  kepId     VARCHAR(20) NOT NULL,
  content   VARCHAR(300)
);

INSERT INTO comment
VALUES ('201611131103324001', '201611131103324001', 'like wise');
INSERT INTO comment
VALUES ('201611131103324002', '201611131103324002', 'like wise');
INSERT INTO comment
VALUES ('201611131103324003', '201611131103324003', 'like wise');
INSERT INTO comment
VALUES ('201611131103324004', '201611131103324004', 'like wise');
INSERT INTO comment
VALUES ('201611131103324005', '201611131103324005', 'like wise');
INSERT INTO comment
VALUES ('201611131103324006', '201611131103324006', 'like wise');
INSERT INTO comment
VALUES ('201611131103324007', '201611131103324007', 'like wise');
INSERT INTO comment
VALUES ('201611131103324008', '201611131103324008', 'like wise');
INSERT INTO comment
VALUES ('201611131103324009', '201611131103324009', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240010', '2016111311033240010', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240011', '2016111311033240011', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240012', '2016111311033240012', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240013', '2016111311033240013', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240014', '2016111311033240014', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240015', '2016111311033240015', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240016', '2016111311033240016', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240017', '2016111311033240017', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240018', '2016111311033240018', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240019', '2016111311033240019', 'like wise');
INSERT INTO comment
VALUES ('2016111311033240020', '2016111311033240020', 'like wise');
