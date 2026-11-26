class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i =0;i<n;i++){
            int left = 0;
            int right = 1;
            while(left<right && left<n && right<n){
                if(nums[left]>nums[right]){
                    int temp = nums[left];
                    nums[left]= nums[right];
                    nums[right]=temp;
                    left++;
                    right++;
                }else{
                    left++;
                    right++;
                }
            }
        }
    }
}