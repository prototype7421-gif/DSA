class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> freq = new HashMap <>();
        for(int i =0;i<nums.length;i++){
            freq.put(nums[i],freq.getOrDefault(nums[i],0)+1);
        }
        for(int element : freq.keySet()){
      int   count = freq.get(element);
        if(count > nums.length/2){
            return element;
        }
    }
    return -1;
    }
}