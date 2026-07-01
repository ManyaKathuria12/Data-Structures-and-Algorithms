1class Solution {
2    public int[] runningSum(int[] nums) {
3       
4        for(int i=1;i<nums.length;i++){
5            nums[i]=nums[i]+nums[i-1];
6        }
7        return nums;
8    }
9}