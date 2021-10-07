package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 1, 5, 4, 3, 2, 1, 2, 1, 1, 3, 4, 5};

        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for (int key : histogr.keySet()) {
            System.out.println(key  + "==>" + histogr.get(key));
        }
    } 
} 