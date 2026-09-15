
import java.util.Arrays;

public class countTriplets {
    int counttri(int sum, int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        int i =0;
        for(i=0;i<arr.length-2;i++){
            int left = i+1;
            int right = arr.length-1;
            while(left<right){
                 int currentsum = arr[i]+arr[left]+arr[right];
                if(currentsum<sum){
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
