CREATE TABLE if not exists MovieUsers (
  ID bigint NOT NULL,
  First_Name VARCHAR(50) NOT NULL,
  Last_Name varchar(50),
  Movie_Name varchar(255) NOT NULL,
  Year_Watched DATE NOT NULL,
  PRIMARY KEY (ID)
);

