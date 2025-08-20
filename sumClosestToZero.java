import java.util.*;
public class sumClosestToZero {
    public static void main(String[] args) {
        // int[] arr= {-21,-67,-37,-18,4,-65};
        int[] arr= {-3, -1, 2, 4};
        System.out.println(closestToZero(arr));
    }
    static int closestToZero(int[] arr){
        Arrays.sort(arr);
        
        int actualSum=Integer.MAX_VALUE;

        int l=0;
        int r=arr.length-1;

        while(l<r){
            int currSum=arr[l]+arr[r];

            if((Math.abs(currSum)<Math.abs(actualSum)) ){
                actualSum=currSum;
            }
            
            if(currSum<0) l++;
            else r--;
        }


        return actualSum;
    }
}
