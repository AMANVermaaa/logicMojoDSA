import java.util.*;


public class pairs {
    public static void main(String[] args) {
        int[] arr= {1, 5, 3, 4, 2};
        int key=2;

        System.out.println(pairBrute(arr,key));
        System.out.println(pairTwoPointer(arr,key));
        System.out.println(pairHashSet(arr,key));
    }

    //time complexity=O(n^2)
    //space complexity=O(1)
    static int pairBrute(int[] arr, int key){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[j]-arr[i])==key)
                    count++;
            }
        }


        return count;
    }

    //time complexity=O(nlogn)
    //space complexity=O(1)
    static int pairTwoPointer(int[] arr, int key){

        int count=0;
        int left =0;
        int right =1;
        Arrays.sort(arr);
        while (right<arr.length){
            int diff=arr[right]-arr[left];
            if(diff==key){
                count++;
                left++;
                right++;
            }
            else if(diff<key){
                right++;
            }
            else {
                left++;
                if(left==right) right++;
            }
        }


        return count;
    }

    
    //time complexity=O(n)
    //space complexity=O(n)
    static int pairHashSet(int[] arr, int key){
        int count=0;
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }
        for(int num:arr){
            if(set.contains(num+key)){
                count++;
            }
        }


        return count;
    }
}
