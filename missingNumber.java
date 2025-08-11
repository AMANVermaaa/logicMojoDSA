public class missingNumber {
    public static void main(String[] args) {
        int[] arr= {9,6,4,2,3,5,7,0,1};
        int n= arr.length;
        int xor=0;
        for(int i=1;i<=n;i++)
            xor^=i;
        for(int num : arr)
            xor^=num;
        System.out.println("Missing Number in array is "+xor);
    }
}
