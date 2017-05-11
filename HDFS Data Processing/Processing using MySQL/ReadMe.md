In this item, I created a MySQL Database named "WEBLOGS" and a set of two tables - "SMALL_LOGS" and "MEDIUM_LOGS" for insertion of raw data from the log files present in logs-2015-2014.zip and small-logs-08-09-2016.zip files respectively. For this purpose, I used the shell scripts log_create_table.sh to create the SMALL_LOGS table and the mediumlog_create_table.sh to create the MEDIUM_LOGS table.

Both logs-2015-2014.zip and small-logs-08-09-2016.zip are uncompressed first. The resulting log files are merged together into a single log file using CAT command. The resulting files are named as "smalllogs.log" and "logs-2015.log". Then DataTransfer.java and MediumLogsDataTransfer.java are written to read the data line by line from both "smalllogs.log" and "logs-2015.log" files respectively and populate them inside the SMALL_LOGS and MEDIUM_LOGS table.

The snapshots of successful insertion of the data are given below:

Snapshot of the first 10 records from the smalllogs.log file

![small_logs_first10](https://cloud.githubusercontent.com/assets/17952712/25507422/959fbfd0-2b71-11e7-8347-d223a80c07c3.JPG)


Snapshot of the last 10 records from the smalllogs.log file

![small_logs_last10](https://cloud.githubusercontent.com/assets/17952712/25507435/a7ec5388-2b71-11e7-8ab7-121787d6701d.JPG)




Snapshot of the first 10 records from the logs-2015.log file

![medium_logs_first10](https://cloud.githubusercontent.com/assets/17952712/25460398/e2a1353a-2aa8-11e7-8395-86be78fe6767.JPG)


Snapshot of the last 10 records from the logs-2015.log file

![medium_logs_last10](https://cloud.githubusercontent.com/assets/17952712/25460409/f3319c14-2aa8-11e7-8158-16bd7bf474a5.JPG)



After the successful insertion, I used the following query to compute the most frequently visited URL each month in the small logs file:


SELECT YEAR,
CASE
    WHEN MONTH = 8 THEN 'August'
    WHEN MONTH = 9 THEN 'September'
END AS RECORDED_MONTH,
FREQUENTLY_VISITED_URL, MAX(counted_logs) AS FREQUENCY_OF_VISIT FROM
(SELECT YEAR(LOG_DATE) AS YEAR, MONTH(LOG_DATE) AS MONTH, LOG_WEBFILE AS FREQUENTLY_VISITED_URL, COUNT(LOG_WEBFILE) AS counted_logs
FROM SMALL_LOGS
WHERE LOG_WEBFILE NOT LIKE '/' AND LOG_WEBFILE NOT LIKE '%index.%' AND LOG_NUMBER2 = 200
GROUP BY LOG_WEBFILE, MONTH(LOG_DATE)
ORDER BY COUNT(LOG_WEBFILE) DESC) AS FIRSTSUBQUERY
GROUP BY MONTH
ORDER BY YEAR, RECORDED_MONTH;

After executing the above query, I got the following result:

![final_output_month_small_logs](https://cloud.githubusercontent.com/assets/17952712/25552359/d6c659a6-2c5c-11e7-946d-98986b507fe6.JPG)

[Note: Time taken for the execution is 28.46 sec]


I used the following query to compute the most frequently visited URL present in the small logs file for each day in the time frame from 19 August 2016 till 14 September 2016:

SELECT YEAR,
CASE
    WHEN MONTH = 8 THEN 'August'
    WHEN MONTH = 9 THEN 'September'
END AS RECORDED_MONTH,
RECORDED_DATE, URL, MAX(url_visit_count)
FROM
(SELECT YEAR(LOG_DATE) AS YEAR, MONTH(LOG_DATE) AS MONTH, DAY(LOG_DATE) AS RECORDED_DATE, LOG_WEBFILE AS URL, COUNT(LOG_WEBFILE) AS url_visit_count
FROM SMALL_LOGS
WHERE LOG_WEBFILE NOT LIKE '/' AND LOG_WEBFILE NOT LIKE '%index.%' AND LOG_NUMBER2 = 200 
GROUP BY LOG_WEBFILE, DAY(LOG_DATE) 
ORDER BY YEAR, MONTH, RECORDED_DATE, COUNT(LOG_WEBFILE) DESC) AS COUNT_SUB_QUERY
GROUP BY RECORDED_DATE
ORDER BY YEAR, RECORDED_MONTH, RECORDED_DATE;


The results that I obtained are given in the snapshot below:

![final_output_day_small_logs](https://cloud.githubusercontent.com/assets/17952712/25552362/f245b2f8-2c5c-11e7-8bfc-6d511e0cfc7f.JPG)

[Note: Execution Time is 14.24 seconds]


The queries to process the data in the MEDIUM_LOGS file is given below:

For the month wise calculation, I used the following MySQL query:

SELECT YEAR,
CASE
    WHEN MONTH = 1 THEN 'January'
    WHEN MONTH = 2 THEN 'February'
    WHEN MONTH = 3 THEN 'March'
    WHEN MONTH = 4 THEN 'April'
    WHEN MONTH = 5 THEN 'May'
    WHEN MONTH = 6 THEN 'June'
    WHEN MONTH = 7 THEN 'July'
    WHEN MONTH = 8 THEN 'August'
    WHEN MONTH = 9 THEN 'September'
    WHEN MONTH = 10 THEN 'October'
    WHEN MONTH = 11 THEN 'November'
    WHEN MONTH = 12 THEN 'December'
END AS RECORDED_MONTH,
FREQUENTLY_VISITED_URL, MAX(counted_logs) AS FREQUENCY_OF_VISIT FROM
(SELECT YEAR(LOG_DATE) AS YEAR, MONTH(LOG_DATE) AS MONTH, LOG_WEBFILE AS FREQUENTLY_VISITED_URL, COUNT(LOG_WEBFILE) AS counted_logs
FROM MEDIUM_LOGS
WHERE LOG_WEBFILE NOT LIKE '/' AND LOG_WEBFILE NOT LIKE '%index.%' AND LOG_NUMBER2 = 200
GROUP BY LOG_WEBFILE, MONTH(LOG_DATE)
ORDER BY COUNT(LOG_WEBFILE) DESC) AS FIRSTSUBQUERY
GROUP BY MONTH
ORDER BY YEAR, MONTH;

The results that I obtained upon successful execution is given below:

![final_output_month_medium logs](https://cloud.githubusercontent.com/assets/17952712/25552372/5152ab5c-2c5d-11e7-8323-fb832a1f64d4.JPG)

[Note: Execution Time is 9.52 sec]


For the day wise calculation, I used the following query:

SELECT YEAR,
CASE
    WHEN MONTH = 1 THEN 'January'
    WHEN MONTH = 2 THEN 'February'
    WHEN MONTH = 3 THEN 'March'
    WHEN MONTH = 4 THEN 'April'
    WHEN MONTH = 5 THEN 'May'
    WHEN MONTH = 6 THEN 'June'
    WHEN MONTH = 7 THEN 'July'
    WHEN MONTH = 8 THEN 'August'
    WHEN MONTH = 9 THEN 'September'
    WHEN MONTH = 10 THEN 'October'
    WHEN MONTH = 11 THEN 'November'
    WHEN MONTH = 12 THEN 'December'
END AS RECORDED_MONTH,
RECORDED_DATE, URL, MAX(url_visit_count) AS FREQUENCY_VISITS
FROM
(SELECT YEAR(LOG_DATE) AS YEAR, MONTH(LOG_DATE) AS MONTH, DAY(LOG_DATE) AS RECORDED_DATE, LOG_WEBFILE AS URL, COUNT(LOG_WEBFILE) AS url_visit_count
FROM MEDIUM_LOGS
WHERE LOG_WEBFILE NOT LIKE '/' AND LOG_WEBFILE NOT LIKE '%index.%' AND LOG_NUMBER2 = 200
GROUP BY LOG_WEBFILE, DAY(LOG_DATE), MONTH(LOG_DATE), YEAR(LOG_DATE)
ORDER BY YEAR, MONTH, RECORDED_DATE, COUNT(LOG_WEBFILE) DESC) AS COUNT_SUB_QUERY
GROUP BY RECORDED_DATE, MONTH, YEAR
ORDER BY YEAR, MONTH, RECORDED_DATE;

The results that I obtained upon successful execution is given below:

![final_output_day_medium logs](https://cloud.githubusercontent.com/assets/17952712/25552374/8afdae10-2c5d-11e7-95d2-668ffe5f1ab6.JPG)

![final_output_day_2 medium logs](https://cloud.githubusercontent.com/assets/17952712/25552386/f4e7bc62-2c5d-11e7-95eb-168f1df3c122.JPG)

[Note: Execution Time is 10.36 sec]
