class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        int dup = num;
        for(int n =1;n< num;n++){
             if(num % n ==0){
               sum = sum + n; 
             }
    }
     return sum == dup;
    }
}