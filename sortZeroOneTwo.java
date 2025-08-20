public class sortZeroOneTwo {
    public static void main(String[] args) {
        int[] arr= {0,1,1,0,1,2,1,2,0,0,0,1};
        sortNumbers(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    static void sortNumbers(int[] arr){
        
        int l=0;
        int h=arr.length-1;
        int m=0;
        
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else {
                int temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            }

        }
        
    }
    
}
