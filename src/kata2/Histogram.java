package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;
    
    public Histogram(int[] a){
        this.data = a;
    }
    
    public int[] get_data(){
        return this.data;
    }
    
    public Map<Integer, Integer> getHistogram(){
        Map<Integer, Integer> histogram = new HashMap();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;
    }
}
