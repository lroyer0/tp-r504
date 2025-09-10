CREATE DATABASE IF NOT EXISTS demosql;
USE demosql;
CREATE TABLE IF NOT EXISTS myTable (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(45) NOT NULL
);
INSERT INTO myTable (name) VALUES ('bob'), ('alice'), ('john');

