class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;

        int n = nums.length;
        int ExpectedSum = n *(n+1)/2;
        for(int i =0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        int MissingNum = ExpectedSum - sum;
        return MissingNum;
    }
}