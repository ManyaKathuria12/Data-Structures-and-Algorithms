1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3      int x = 0;
4     for(String op:operations){
5        if(op.charAt(1) == '+'){
6            x++;
7        }
8        else 
9        x--;
10     }
11     return x;
12    }
13}