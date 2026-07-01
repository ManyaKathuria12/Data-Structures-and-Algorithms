1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int[] result = new int[2];
4        for(int i=0;i<nums.length;i++){
5            for(int j=i+1;j<nums.length;j++){
6                if(nums[i] + nums[j] == target){
7                    result[0]=i;
8                    result[1]=j;
9                }
10            }
11        }
12        return result;
13    }
14}