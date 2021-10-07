package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;
    
    public Histogram(T[] a){
        this.data = a;
    }
    
    public T[] get_data(){
        return this.data;
    }
    
    public Map<T, Integer> getHistogram(){
        Map<T, Integer> histogram = new HashMap();
        
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        return histogram;
    }
}
