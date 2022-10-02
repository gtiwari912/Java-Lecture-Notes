// Question Link: https://leetcode.com/problems/majority-element/

// Optimized approach which takes less Space

// Moore Majority Voting algorithm

class Solution {
    public int majorityElement(int[] nums) {
        int maj = nums[0];
        int vote = 1;
        for(int i = 1; i<nums.length; i++){
            int curElement = nums[i];
            if(curElement == maj){
                vote++;
            }
            else{
                vote--;
                if(vote==0){
                    maj = curElement;
                    vote = 1;
                }
            }
        }
        return maj;
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