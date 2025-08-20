import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int x=0;
        ArrayList<ArrayList<Integer>> list=sumTwo(arr,x);
        for(ArrayList<Integer> i:list)
            System.out.println(i);
    }

    // static ArrayList<ArrayList<Integer>> sumTwo(int[] arr, int x){
    //     Arrays.sort(arr);
    //     int low=0;
    //     int high=arr.length-1;
    //     HashSet<String> seem = new HashSet<>();
    //     ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    //     while(low<high){
    //         int currSum=arr[low]+arr[high];
    //         ArrayList<Integer> ls = new ArrayList<>();
    //         if(currSum==x ) {
    //             int a=arr[low];
    //             int b=arr[high];
    //             String key=a+","+b;
    //             if(!seem.contains(key)){
    //                 seem.add(key);
    //                 ls.add(arr[low]); 
    //                 ls.add(arr[high]);
    //                 res.add(ls);
                    
    //             }
    //             low++;
    //         }
    //         else if(currSum<x){
    //             low++;
    //         }
    //         else{
    //             high--;
    //         }

    //     }
    //     return res;

    // }






















    static ArrayList<ArrayList<Integer>> sumTwo(int[] arr,int x){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> mp= new HashMap<>();
        HashSet<String> seem = new HashSet<>();

        for(int num: arr){
            int compliment = x-num;
            if(mp.containsKey(compliment)){

                int a=Math.min(compliment, num);
                int b=Math.max(compliment,num);
                String key =a+","+b;
                if(!seem.contains(key)){
                    seem.add(key);
                    ArrayList<Integer> ls = new ArrayList<>();
                    ls.add(a);
                    ls.add(b);
                    res.add(ls);
                }
            }

            

            mp.put(num,1);
        }

        res.sort((l1,l2)->l1.get(0)-l2.get(0));



        return res;
    }
}
