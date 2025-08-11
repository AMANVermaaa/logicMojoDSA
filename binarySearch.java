public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,8,10,15,16,20};
        int target=15;

        System.out.println(iterativeApproach(arr,target));
        System.out.println(recursiveApproach(arr,target,0,arr.length-1));
    }

    static int iterativeApproach(int[] arr,int target){
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid = high - (high-low)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }

    static int recursiveApproach(int[] arr, int target, int low, int high){

        if(low>high) return -1;
        int mid = high-(high-low)/2;

        if(arr[mid]==target) return mid;
        if(arr[mid]<target) return recursiveApproach(arr, target, low, mid-1);
        return recursiveApproach(arr, target, mid+1, high);
    }
    
}
