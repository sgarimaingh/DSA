package Array;

import org.graalvm.collections.Pair;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentWithHighestAvgScore {

    public void getStudent(){
         String scores[][] = {{"jerry","65"},{"bob","51"}, {"jerry","23"}, {"Eric","83"}};

         int n = scores.length;
         Map<String, Pair<Integer, Double>> average = new LinkedHashMap<>();

         for(String[] score: scores){
             String name = score[0];
             Double num = (double) Integer.parseInt(score[1]);
             if(!average.containsKey(name)){
                 average.put(name, Pair.create(1,num));
             }
             else{
                 Pair<Integer, Double> p = average.get(name);
                 int count = p.getLeft();
                 Double avg = p.getRight();
                 average.put(name, Pair.create(count++, (avg+num)/count+1));
             }
         }
        String res = null;
        Double max =0.0;

        for(String key: average.keySet()){
             Double avg = average.get(key).getRight();
             if(avg>max){
                 max = avg;
                 res = key;
             }
         }
         System.out.println(res);



}
}
