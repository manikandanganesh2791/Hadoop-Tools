// cc MaxFrequencyURLReducer Reducer for frequently visited URL example
import java.io.IOException;
import java.util.*;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MaxFrequencyURLReducer
  extends Reducer<Text, Text, Text, Text> {
  
  @Override
  public void reduce(Text key, Iterable<Text> values,
      Context context)
      throws IOException, InterruptedException {
    
    int countVal = 0;
    int countUrl = 0;
    String resultURL = "";
    HashMap<String, Integer> urlCountMap = new HashMap<String, Integer>();
    for (Text value : values) {
        if(!urlCountMap.containsKey(value.toString()))
            urlCountMap.put(value.toString(), 1);
        else{
            countVal = urlCountMap.get(value.toString());
            urlCountMap.put(value.toString(), countVal+1);
        }
    }
    for(Map.Entry<String, Integer> urlMapEntry : urlCountMap.entrySet()){
        if(urlMapEntry.getValue() > countUrl){
            countUrl = urlMapEntry.getValue();
            resultURL = urlMapEntry.getKey();
        }
    }    
    context.write(new Text(key), new Text(resultURL));
  }
}
