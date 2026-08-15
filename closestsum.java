
import java.util.Arrays;

public class closestsum {
    int countTriplets(int sum, int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        sum =2;
        int i =0;
        for(i=0;i<arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                 int closestsum = arr[i]+arr[left]+arr[right];
                if(closestsum<sum){
                   count+=(right-left);
                   left++;
                }else{
                    right--;
                }
        }
    }
      return count;
}
}
