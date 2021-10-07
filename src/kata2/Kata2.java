package kata2;

import java.util.HashMap;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 1, 5, 4, 3, 2, 1, 2, 1, 1, 3, 4, 5};

        HashMap<Integer, Integer> histogram = new HashMap();

        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }

        for (int key : histogram.keySet()) {
            System.out.println(key  + "==>" + histogram.get(key));
        }
    } 
} 