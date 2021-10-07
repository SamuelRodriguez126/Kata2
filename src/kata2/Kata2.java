package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 1, 5, 4, 3, 2, 1, 2, 1, 1, 3, 4, 5};

        HashMap<Integer, Integer> histogram = new HashMap();

        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]) + 1);
            }else{
                histogram.put(data[i], 1);
            }
        }

        for (int key : histogram.keySet()) {
            System.out.println(key  + "==>" + histogram.get(key));
        }
    } 
} 