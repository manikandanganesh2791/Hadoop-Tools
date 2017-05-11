// cc MaxFrequencyURLMapper Mapper for highly frequent URL example
import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.util.*;

public class MaxFrequencyURLMapper
  extends Mapper<LongWritable, Text, Text, Text> {
  
  private static final String fixedCode = "200";
  
  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException {
    
    String line = value.toString();
    ArrayList<String> lineList = new ArrayList<String>();
    String url = "";
    String returnCode = "";
    String dateVal = "";
    if(!line.substring(0,1).equals("#")){
        lineList.addAll(Arrays.asList(line.split(" ")));
        if(lineList.get(4).length() > 1){
            dateVal = lineList.get(0);  //add .substring(0,7) to the existing code to find the monthly records
            if(!lineList.get(4).contains("index."))
                url = lineList.get(4);
            returnCode = lineList.get(10);
        }
    }
    if (returnCode.equals(fixedCode))
        context.write(new Text(dateVal), new Text(url));
  }
}
