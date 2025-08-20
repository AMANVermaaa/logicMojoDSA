public class segregate0and1 {
    public static void main(String[] args) {
        int[] arr= {1,0};
        // bruteForce(arr);
        twoPointer(arr);
        
        for(int num:arr){
            System.out.println(num);
        }

    }
    static void bruteForce(int[] arr){
        int count=0;
        for (int num:arr){
            if(num==0){
                count++;
            }

        }
        for(int i=0;i<arr.length;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    static void twoPointer(int[] arr){
        int l=0;
        int r=arr.length-1;

        while(l<r){
            while(l<r && arr[l]==0) l++;
            while(l<r && arr[r]==1) r--;
            
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
        }
        
    }
}
