mysql -u root -psafestsystemever -e "USE WEBLOGS;
DROP TABLE IF EXISTS MEDIUM_LOGS;
CREATE TABLE MEDIUM_LOGS(
ML_Id INT NOT NULL AUTO_INCREMENT,
Log_Date DATE,
Log_Time VARCHAR(20),
Log_Path VARCHAR(20),
Log_Type VARCHAR(10),
Log_Webfile VARCHAR(200),
Log_Number1 INT,
Log_IPAddress VARCHAR(50),
Log_Number2 INT,
Log_Number3 INT,
Log_Systembit INT,
Log_Number4 INT,
PRIMARY KEY(ML_Id));"
