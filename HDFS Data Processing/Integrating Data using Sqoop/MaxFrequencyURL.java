
import java.io.IOException;
import com.cloudera.sqoop.lib.RecordParser.ParseError;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.*;
import java.sql.Date;
import java.util.*;

public class MaxFrequencyURL extends Configured implements Tool {

  public static class MaxFrequencyURLMapper
      extends Mapper<LongWritable, Text, Text, Text> {

   

    public void map(LongWritable k, Text v, Context context) throws IOException, InterruptedException{
      SMALL_LOGS smalllogs = new SMALL_LOGS();
      String recordDate = "";
      String url = "";
      Integer logNumber = 0; 
      try {
        smalllogs.parse(v); // Auto-generated: parse all fields from text.
      } catch (ParseError pe) {
        // Got a malformed record. Ignore it.
        return;
      }

      
      Integer id = smalllogs.get_L_Id();
      if (null == id) {
        return;
      } 
      else {
        recordDate = smalllogs.get_Log_Date().toString().substring(0,7);
        url = smalllogs.get_Log_Webfile();
        logNumber = smalllogs.get_Log_Number2();
      }
    
   
      if (logNumber == 200) {
        context.write(new Text(recordDate), new Text(url));
      }   
    }
  }
  public static class MaxFrequencyURLReducer
      extends Reducer<Text, Text, Text, Text> {

    public void reduce(Text k, Iterable<Text> vals, Context context)
        throws IOException, InterruptedException {
      SMALL_LOGS smallLogs = null;
      HashMap<String, Integer> urlCountMap = new HashMap<String, Integer>();
      int countValue = 0;
      int frequencyValue = 0;
      String resultURL = "";
      for (Text w : vals) {

       if(!urlCountMap.containsKey(w.toString()))
          urlCountMap.put(w.toString(), 1);
       else{
          countValue = urlCountMap.get(w.toString());
          urlCountMap.put(w.toString(), countValue+1);
       }
      }

      for(Map.Entry<String, Integer> urlMapEntry : urlCountMap.entrySet()){
         if(urlMapEntry.getValue() > frequencyValue){
            frequencyValue = urlMapEntry.getValue();
            resultURL = urlMapEntry.getKey();
         }
      }
      context.write(new Text(k), new Text(resultURL));
    }
  }

  public int run(String [] args) throws Exception {
    Job job = new Job(getConf());

    job.setJarByClass(MaxFrequencyURL.class);

    job.setMapperClass(MaxFrequencyURLMapper.class);
    job.setReducerClass(MaxFrequencyURLReducer.class);

    FileInputFormat.addInputPath(job, new Path("SMALL_LOGS"));
    FileOutputFormat.setOutputPath(job, new Path("MAXFREQUENCYURL_MONTH"));

    job.setMapOutputKeyClass(Text.class);
    job.setMapOutputValueClass(Text.class);

    job.setOutputKeyClass(Text.class);
    job.setOutputValueClass(Text.class);

    job.setNumReduceTasks(1);

    if (!job.waitForCompletion(true)) {
      return 1; // error.
    }

    return 0;
  }

  public static void main(String [] args) throws Exception {
    int ret = ToolRunner.run(new MaxFrequencyURL(), args);
    System.exit(ret);
  }
}
