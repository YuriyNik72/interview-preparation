
drop database if exists Cinema;
create database Cinema;
use Cinema;

DROP table if exists Film;
create table Film (
                      Id INT not null AUTO_INCREMENT, PRIMARY KEY (id),
                      Name VARCHAR(100)  NOT NULL,
                      Duration TIME  NOT NULL,
                      Price FLOAT  NOT NULL
)ENGINE=InnoDB AUTO_INCREMENT=1;


DROP table if exists Hall;
create table Hall (
                      Id INT not null AUTO_INCREMENT, PRIMARY KEY (id),
                      Name VARCHAR(100) NOT NULL
)ENGINE=InnoDB AUTO_INCREMENT=1;


DROP table if exists Schedule;
create table Schedule (
                          Id INT not null AUTO_INCREMENT, PRIMARY KEY (id),
                          HallId INT NOT NULL, FOREIGN KEY Hall(Id) REFERENCES Film(id),
                          FilmId INT NOT NULL, FOREIGN KEY Film(Id) REFERENCES Film(id),
                          TIME datetime NOT NULL
)ENGINE=InnoDB AUTO_INCREMENT=1;


INSERT INTO Film VALUES (1,'Пятница, 13-е', '1:00', 7.0),(2,'Фредди Крюгер','0:30',4.0),(3,'Терминатор','1:30',10.0),(4,'Сумерки','2:00',13.0),(5,'Альф','1:00',6.0);
INSERT INTO Hall VALUES (1,'Alpha'),(2,'Betta'),(3,'Charly');
INSERT INTO Schedule VALUES (1,1,1,'2020-12-23 0:00'),(2,2,2,'2020-12-23 0:30'),(3,1,3,'2020-12-23 1:30'),(4,1,4,'2020-12-23 2:30'),(5,1,5,'2020-12-23 5:00');


SELECT * FROM Schedule JOIN Film ON FilmId = Film.Id;

CREATE VIEW FilmSchedule AS
SELECT F.Id
     ,F.Name
     ,F.Duration
     ,S.TIME AS FilmStart
     ,CAST(F.DURATION AS datetime) + CAST(S.TIME AS datetime) AS FilmEnd
     ,S.HallId
FROM Schedule AS S
         JOIN Film AS F
              ON S.FilmId = F.Id;


SELECT  C.id AS Film1ID ,C.Name AS Film1Name ,C.FilmStart AS Film1Start ,C.Duration AS Film1Duration
     ,C1.id AS Film2ID ,C1.Name AS Film2Name ,C1.FilmStart AS Film2Start ,C1.Duration AS Film2Duration
FROM FilmSchedule AS C
         LEFT JOIN FilmSchedule AS C1 ON C1.FilmStart BETWEEN C.FilmStart AND C.FilmEnd
    AND C.Id <> C1.Id AND C.HallId = C1.HallId
WHERE C1.Id IS NOT NULL
ORDER BY Film1Start;

