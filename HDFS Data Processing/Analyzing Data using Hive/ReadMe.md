In this item, I first created the table using sqoop create-hive-table command to connect to the jdbc driver and populate them into the hive table having consistency with the table name.

I then used LOAD DATA INPATH "small_logs" INTO small_logs to load data into the table on hive.

After loading the data, I used the following hive queries to calculate the most frequently used url per month and also per day.
SELECT MONTH(LOG_DATE), MAX(LOG_WEBFILE), COUNT(LOG_WEBFILE)
FROM
(SELECT *
FROM SMALL_LOGS
WHERE LOG_WEBFILE NOT LIKE '%index.%' AND LOG_WEBFILE NOT LIKE '/') AS FIRSTQUERY
WHERE LOG_NUMBER2 = 200
GROUP BY MONTH(LOG_DATE);

SELECT LOG_DATE, MAX(LOG_WEBFILE), COUNT(LOG_WEBFILE)
FROM
(SELECT *
FROM SMALL_LOGS
WHERE LOG_WEBFILE NOT LIKE '%index.%' AND LOG_WEBFILE NOT LIKE '/') AS FIRSTQUERY
WHERE LOG_NUMBER2 = 200
GROUP BY LOG_DATE;

Per Month results:
![result and process](https://cloud.githubusercontent.com/assets/17952712/25561337/83f129da-2d2f-11e7-94bf-5e05203adad0.JPG)
![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25561338/864be936-2d2f-11e7-92b3-c7c7daf8e49e.JPG)
[Note: Execution Time 4 mins]

Per Day results:
![resul_workflow](https://cloud.githubusercontent.com/assets/17952712/25561367/16bacce4-2d30-11e7-81fd-a46dc10a1de5.JPG)
![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25561362/07e8cedc-2d30-11e7-926d-768fa9d128a1.JPG)
[Note Execution Time: 6 mins 47 sec]


For the medium_logs file, the queries used and the snapshots of the results are given below:

SELECT MONTH(LOG_DATE), MAX(LOG_WEBFILE), COUNT(LOG_WEBFILE)
FROM
(SELECT *
FROM MEDIUM_LOGS
WHERE LOG_WEBFILE NOT LIKE '%index.%' AND LOG_WEBFILE NOT LIKE '/') AS FIRSTQUERY
WHERE LOG_NUMBER2 = 200
GROUP BY MONTH(LOG_DATE);


SELECT LOG_DATE, MAX(LOG_WEBFILE), COUNT(LOG_WEBFILE)
FROM
(SELECT *
FROM MEDIUM_LOGS
WHERE LOG_WEBFILE NOT LIKE '%index.%' AND LOG_WEBFILE NOT LIKE '/') AS FIRSTQUERY
WHERE LOG_NUMBER2 = 200
GROUP BY LOG_DATE;


Per Month Results:
![resultandprocess](https://cloud.githubusercontent.com/assets/17952712/25561403/81b084e4-2d30-11e7-85b4-2222addd4b60.JPG)
![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25561405/83c85a18-2d30-11e7-8d7e-f0b858dda3f9.JPG)
[Note: Execution Time: 3 mins 3 secs]

Per Day Results:
![capture](https://cloud.githubusercontent.com/assets/17952712/25561414/b31e7f86-2d30-11e7-9bb8-6ee4a3d86fb7.JPG)
![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25561421/dc64e74a-2d30-11e7-877d-7dc50e9a7c0a.JPG)
[Note: Execution Time: 2 mins 46 secs]
