class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        int special =1;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                special++;
                arr[i]=arr[j];
            }
        }
        return special;
        
    }
}