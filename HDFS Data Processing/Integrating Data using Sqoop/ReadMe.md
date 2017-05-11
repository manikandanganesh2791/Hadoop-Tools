In this item, I wrote MapReduce programs on top of sqoop for processing the data present in the mysql tables SMALL_LOGS, MEDIUM_LOGS residing in the database WEBLOGS. The processing is carried out to identify the most frequently visited URL per month and per day that is not index.* and that also has a return code of 200.

In this process, I first configured the SQOOP_HOME path in bashrc file and after which I first integrated the data from the mysql table to the hdfs using the sqoop import command.

After moving the data on to the hdfs platform, I coded the MaxFrequencyURL.java that has both Mapper and Reducer classes inside it. Also, MaxFrequencyURLMedium.java is created by tweaking the existing file for the MEDIUM_LOGS file. After successful compilation, I created the sqoop-examples-url.jar file to execute them using hadoop command.

After executing the first MapReduce program to calculate the frequently visited websites from the SMALL_LOGS table on a monthly basis, I got the following result:

![workflow](https://cloud.githubusercontent.com/assets/17952712/25560032/8bcf58d2-2d0e-11e7-9e51-4ea520662cc7.JPG)
![result](https://cloud.githubusercontent.com/assets/17952712/25560034/9505eede-2d0e-11e7-8b41-c8cd74f14758.JPG)
![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25560058/1b378a80-2d0f-11e7-8e41-8682f272dc56.JPG)
[Note: Execution Time is 5 min 42 sec]

Likewise, I have include the snapshots of frequently visited url per day for SMALL_LOGS table below:

![workflow](https://cloud.githubusercontent.com/assets/17952712/25560071/5bbeb9ac-2d0f-11e7-9e5b-ff75da944cfc.JPG)
![result](https://cloud.githubusercontent.com/assets/17952712/25560073/5e0d94e4-2d0f-11e7-99a4-d64bafcacee6.JPG)
![job history](https://cloud.githubusercontent.com/assets/17952712/25560075/793530c4-2d0f-11e7-990d-c31e1294bb04.JPG)
[Note: Execution Time is 3 min 10 sec]

The snapshots of my findings for the frequently visited url per month for MEDIUM_LOGS table are given below:

![workflow](https://cloud.githubusercontent.com/assets/17952712/25560089/ac464b7e-2d0f-11e7-98b3-09f03b4aa403.JPG)
![result](https://cloud.githubusercontent.com/assets/17952712/25560090/ae27e2fe-2d0f-11e7-8b5c-cf14eddf5eba.JPG)
![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25560100/d25777de-2d0f-11e7-870a-90617c4562f8.JPG)
[Note: Execution Time is 2 min 04 sec]


The snapshots of my findings for the frequently visited url per day for MEDIUM_LOGS table are given below:

![workflow](https://cloud.githubusercontent.com/assets/17952712/25560163/f6b49fce-2d11-11e7-90e8-4a2279a1b58e.JPG)
![result_1](https://cloud.githubusercontent.com/assets/17952712/25560164/f87439a0-2d11-11e7-9c1b-dadafa3a8dad.JPG)
![result_2](https://cloud.githubusercontent.com/assets/17952712/25560166/f9cd5a84-2d11-11e7-8e83-8d26aa147d22.JPG)
![result_3](https://cloud.githubusercontent.com/assets/17952712/25560167/fb60e000-2d11-11e7-9368-52f8d294523b.JPG)
![jobhistory](https://cloud.githubusercontent.com/assets/17952712/25560168/fcd0770c-2d11-11e7-83b4-e50a414c8c4f.JPG)
[Note: Execution Time is 2 mins 5 secs] 
