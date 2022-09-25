// Question Link: https://leetcode.com/problems/two-sum/

//Note: On leetcode we dont need to take input or give output to user, we just need to write the main logic of program inside the function and return the answer;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        for(int i = 0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==j){
                    continue;
                }
                int iElement = nums[i];
                int jElement = nums[j];
                int sum = iElement + jElement;
                if(sum == target){
                    int[] answer = new int[2];
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        int[] randomReturn = new int[2];
        return randomReturn;
    }
}