public class moveZeroes {
    public static void main(String[] args) {
        int[] arr={1, 2, 0, 0, 3, 4};
        moverZeroesToEnd(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void moverZeroesToEnd(int[] arr){
        int insertPos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[insertPos]=arr[i];
                if(i!=insertPos)
                    arr[i]=0;
                insertPos++;
            }
        }
    }
    
}
