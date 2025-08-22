import java.util.HashMap;

public class largestSubarray {
    public static void main(String[] args) {
        int[] arr= {5, -4, 0, -43, 79, 46, -33, -23, 6, -4, 21, -29, -20, -5, 37, -47, 80, -79, -68, 42};
        // int[] arr= {1,-1,3,2,-2,-8,1,7,10,23 };
        //int[] arr= {-31, -48, -90, 54, 20, 95, 6, -86, 22};
        int sum=0;
        int maxi=0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=i+1;
            }
            else {
                if(!mp.containsKey(sum)){
                    mp.put(sum,i);
                }
                else {
                    maxi=Math.max(maxi,i-mp.get(sum));
                }
            }
        }
        System.out.println(maxi);
    }
}
