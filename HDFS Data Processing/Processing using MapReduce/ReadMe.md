In this item, I wrote MapReduce programs for processing the data present in the small-logs-08-09-2016.zip and logs-2014-2015.zip files to find the most frequently visited URL per month and per day based on the conditions that the URL is not of the type index.* and has a return code of 200. 

In this process, both logs-2015-2014.zip and small-logs-08-09-2016.zip are uncompressed first. The resulting log files are merged together into a single log file using CAT command. The resulting files are named as "smalllogs.log" and "logs-2015.log". Then, the hdfs -copyFromLocal command is used to distribute them across nodes in the hdfs.



After moving the data on to the hdfs platform, I coded the MaxFrequencyURL.java, MaxFrequencyURLMapper.java and MaxFrequencyURLReducer.java and compiled them to get their corresponding classes. After successful compilation, I created the jar file to execute them using hadoop command.

After executing the first MapReduce program to calculate the frequently visited websites for the smalllogs.log file on a monthly basis, I got the following result:

![mapreduce_workflow](https://cloud.githubusercontent.com/assets/17952712/25559727/12c1a09c-2d06-11e7-9113-347338912337.JPG)
![result](https://cloud.githubusercontent.com/assets/17952712/25559729/16dee4b4-2d06-11e7-80a6-6d4740c38792.JPG)

The history server shows the successful execution and the time frame details as given in the snapshot below:

![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25559775/233b558e-2d07-11e7-85d0-e2393f14f540.JPG)
[Note: Execution Time is 5 min 22 sec]

Likewise, I have include the snapshots of frequently visited url per day for small logs file below:


![workflow](https://cloud.githubusercontent.com/assets/17952712/25559792/af7f9096-2d07-11e7-85d4-aace7496e18e.JPG)
![result](https://cloud.githubusercontent.com/assets/17952712/25559791/accc753a-2d07-11e7-80db-72b1e1518579.JPG)
![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25559794/c411d028-2d07-11e7-985b-e91bf754b9cb.JPG)i
[Note: Execution Time is 3 min 49 sec]

The snapshots of my findings for the frequently visited url per month for medium logs file are given below:

![workflow_mapreduce](https://cloud.githubusercontent.com/assets/17952712/25559893/d9052b3a-2d0a-11e7-8e87-cb0a58dd4a5c.JPG)
![result](https://cloud.githubusercontent.com/assets/17952712/25559894/db2c13ce-2d0a-11e7-99d8-284931731348.JPG)
![job_history](https://cloud.githubusercontent.com/assets/17952712/25559908/63b19e1c-2d0b-11e7-95ad-868fa752c8e8.JPG)
[Note: Execution Time is 2 min 22 sec]


The snapshots of my findings for the frequently visited url per day for medium logs file are given below:

![workflow](https://cloud.githubusercontent.com/assets/17952712/25559923/034e1612-2d0c-11e7-8618-d0138f98e0f6.JPG)
![result_1](https://cloud.githubusercontent.com/assets/17952712/25559924/06c752f4-2d0c-11e7-8593-48a71dd39931.JPG)
![result_2](https://cloud.githubusercontent.com/assets/17952712/25559925/0990b3e0-2d0c-11e7-898d-c5c22b8556b0.JPG)
![result_3](https://cloud.githubusercontent.com/assets/17952712/25559926/0bfb3646-2d0c-11e7-9457-4b56b3094d1e.JPG)
![result_4](https://cloud.githubusercontent.com/assets/17952712/25559928/0e750a96-2d0c-11e7-955a-ac1153f086b4.JPG)
![historyserver](https://cloud.githubusercontent.com/assets/17952712/25559929/1f570828-2d0c-11e7-8de9-1c8455975c67.JPG)
[Note: Execution Time is 1 min 58 sec]  
