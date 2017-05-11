## ITEM-TWO

I first started with item-two loading data into the mysql tables from both small-logs and logs-2015 files. I used cat command to merge all the .log files into a single file.

After merging, I used java program (which is available in the item-two by the name of DataTransfer.java and MediumLogsDataTransfer.java) to load every line of the log data into the table and obeying the schema rules.

I assumed that the fifth element that is mentioned as cs-uri-stem as the URL file and the eleventh element having a return code 200 as the return code. I basically populated those data that did not start with '#'.

Once I populated, I tried processing the data to find most frequently visited url per month and per day on mysql. I noticed that the time taken by the java code to populate data was a lot. So, personally I felt that, this type of dataset having more than 10 million lines with varying schema does not go well with using traditional RDBMS engines like MySQL. So, Ease of Gathering is not applicable to mysql engine.

When it comes to processing data, I felt that mysql engine was very fast in computing the results. It was able to fetch the result through grouping on multiple sub queries within a span of 10 seconds or more close to that. Hence, processing speed with mysql engine and writing code is taking the front seat in terms of efficiency and speed.


## ITEM-ONE

I then moved on with item-one for pushing the log files into the hdfs and writing MapReduce on top of it. The time taken by MapReduce to gather and process data was much more efficient than the sql engine. It took comparitively much less time to move data onto hdfs and to process it to find most-frequently-visited website.

However, I took more than a day to figure out the logic, decide the type of data structures and write the java code to execute them efficiently. So, writing code is kind of tedious for item-one. So, I decided to check out item-three which is the use of sqoop over MapReduce.

## ITEM-THREE

I first understood SQOOP as a technology to integrate data residing on mysql engine onto hdfs. While reading through the use-cases and deployment topologies of sqoop, I came to know that sqoop also process the data using MapReduce but integrates the data from the RDBMS to make them get distributed across multiple nodes in the hdfs platform. So, technically there is not big difference between using MapReduce or sqoop as MapReduce in item-one is even more efficient when it comes to storing the data. From the business perspective, when companies are integrating the rdbms systems to distributed systems and transferring all the data sqoop will be much more useful. So gathering data from RDBMS is easy on sqoop but processing and writing code is difficult.

## ITEM-FOUR

I moved on to the next item which is processing data using hive. Hive processes data slower than mysql engine as it incorporates MapReduce over Relational Tables. But gathering data and writing code to retrieve data is faster in hive than MapReduce or sqoop.

## ITEM-FIVE

I struggled a bit in understanding the latin scripts on Pig. But once I understood the concepts, Pig proved to be one of the efficient scripting platform as well as for gathering and processing data. Although, Pig took a slight bit of delay in processing the data, but it was efficient in terms writing scripts. I couldn not figure out the logic on Pig but theoritically, I found efficient in terms of script writing.

## PERSONAL CHOICE
Personally, I felt sqoop was very useful and sqoop combined with hive would have been a money shot for the previous work that I was carrying out as an ETL developer. Using ETL tools to process millions rows of data took me a lot of time. It used to take like more than 6 hours to process the data through the pipeline and sometimes, it become complex as well. Hence, SQOOP with MapReduce on top of it and Hive to process the data is my personal choice.



