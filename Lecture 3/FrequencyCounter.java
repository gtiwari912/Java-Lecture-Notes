// Write a java program to calculate how many times each element has appeared in an array.
import java.util.*;
public class FrequencyCounter {
    public static void main(String[] args) {
       int[] arr = {3,3,6,6,6,6,6,4,4,4,4,4,1,1,1};
       HashMap<Integer, Integer> myMap = new HashMap<>();
       for(int element: arr){
           if(myMap.containsKey(element)){
               myMap.put(element, myMap.get(element)+1);
           }
           else{
               myMap.put(element, 1);
           }
       }
        System.out.println(myMap);
    }
}


// Its highly recommended that you have a look at different methods available in HashMap class
// Ur Task is to understand the working of below methods in hashmap class.
//   map.clear()
//   map.getOrDefault(int key, int defaultValue);
//   map.put(int key, int value);
//   map.isEmpty();
//   map.keySet();
//   map.values();
// Source -     https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html
