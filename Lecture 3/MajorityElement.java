// https://leetcode.com/problems/majority-element/

// Using hashmaps

import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : nums){
            if(map.containsKey(element))
                map.put(element, map.get(element)+1);
            else
                map.put(element, 1);
        }
        System.out.println(map);
        for(int key: map.keySet()){
            if(map.get(key)>n/2)
                return key;
        }
        
        return -1;
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