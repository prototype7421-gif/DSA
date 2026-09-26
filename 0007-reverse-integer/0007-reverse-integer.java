class Solution {
    public int reverse(int x) {
         int reverseDigit=0;
        while(x!=0){
 
            int lastDigit=x%10;
             x=x/10;
             if(reverseDigit > Integer.MAX_VALUE / 10 || reverseDigit == Integer.MAX_VALUE / 10 && lastDigit > Integer.MAX_VALUE % 10 || reverseDigit < Integer.MIN_VALUE / 10 || reverseDigit == Integer.MIN_VALUE / 10 && lastDigit < Integer.MIN_VALUE %10 ){
            
                    return 0;
             }
                 reverseDigit=(reverseDigit * 10)+lastDigit;
            
        }
          return reverseDigit;
    }
}
