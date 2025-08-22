public class searchInRotatedSorted {
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        int target=0;

        System.out.println(modifiedBinarySearch(arr,0,arr.length-1,target));

        
    }
    static int modifiedBinarySearch(int[] arr, int low, int high, int target){
        if(low>high)
            return -1;
        
        int mid=low+(high-low)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[low]<=arr[mid]){
            if(arr[low]<=target && target<=arr[mid])
                return modifiedBinarySearch(arr, low, mid-1, target);
            else
                return modifiedBinarySearch(arr, mid+1, high, target);
        }
        else{
            if(arr[mid]<=target && target<=arr[high])
                return modifiedBinarySearch(arr, mid+1, high, target);
            else
                return modifiedBinarySearch(arr, low, mid-1, target);
        }

        
    }
}
