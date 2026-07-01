1class Solution {
2    public int maximumWealth(int[][] accounts) {
3        int maxWealth=0;
4        for(int i=0;i<accounts.length;i++){
5           int wealth = 0;
6        
7        for(int j=0;j<accounts[i].length;j++){
8            wealth += accounts[i][j];
9        }
10        if(wealth > maxWealth){
11            maxWealth=wealth;
12        }
13    }
14        return maxWealth;
15    }
16}