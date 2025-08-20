;
public class maximumDifference {
    public static void main(String[] args) {
        int[] arr={1,5,2,10};
        System.out.println(maxDiff(arr));
    }
    static int maxDiff(int[] arr){
        int diff=-1;
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min<arr[i])
                diff=Math.max(diff,arr[i]-min);
            else   
                min=arr[i];
        }
        return diff;
    }
}
