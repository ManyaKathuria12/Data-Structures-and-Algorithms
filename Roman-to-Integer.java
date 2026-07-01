1class Solution {
2    public int romanToInt(String s) {
3        int sum = 0;
4        for(int i=0;i<s.length();i++){
5           int curr = value(s.charAt(i));
6
7           if(i<s.length()-1){
8            int next=  value(s.charAt(i+1));
9
10            if(curr<next)
11            sum -= curr;
12
13            else 
14            sum+=curr;
15           }
16            else{
17                sum+=curr;
18            
19           }
20        }
21        return sum;
22    }
23    public int value(char ch){
24        if(ch == 'I') return 1;
25        if(ch == 'V') return 5;
26         if(ch == 'X') return 10;
27          if(ch == 'L') return 50;
28           if(ch == 'C') return 100;
29            if(ch == 'D') return 500;
30        return 1000;
31    }
32}