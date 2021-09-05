DROP TABLE IF EXISTS NOTES;

CREATE TABLE DEV.NOTES (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(250) DEFAULT NULL,
  content VARCHAR(250) NOT NULL,
  createdDate DATETIME NOT NULL,
  updatedDate DATETIME NOT NULL
);