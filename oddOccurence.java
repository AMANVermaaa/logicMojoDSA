public class oddOccurence {
    public static void main(String[] args) {
        int arr[] ={2,7,7,7,2};
        int xor=0;
        for(int num : arr)
            xor^=num;
        System.out.println("Odd Occurence Element in array is "+xor);
    }
}
