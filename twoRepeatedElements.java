public class twoRepeatedElements {
    public static void main(String[] args) {
        int[] arr={1, 2, 1, 3, 4, 3};
        int[] nums=new int[2];
        // nums=twoRepeated(arr);
        nums=xorApproach(arr);
        for (int i : nums) {
            System.out.println(i);
        }
    }
    static int[] xorApproach(int[] arr){
        int[] res= new int[2];
        int xor=0;
        for(int num : arr)
            xor^=num;
        for(int i=1;i<=arr.length-2;i++)
            xor^=i;
        
        int rightMostSetBit = xor & -xor;
        System.out.println(rightMostSetBit);
        for(int num:arr){
            if((num & rightMostSetBit)==0)
                res[0]^=num;
            else
                res[1]^=num;
        }

        for(int i=1;i<=arr.length-2;i++){
            if((i & rightMostSetBit)==0)
                res[0]^=i;
            else    
                res[1]^=i;
        }

        return res;
    }
    static int[] twoRepeated(int[] arr){
        int[] res= new int[2];
        int count=0;
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i]);
            if(arr[index]<0){
                res[count++]=index;
            }
            else{
                arr[index]=-arr[index];
            }
        }
        return res;
    }
    
}
