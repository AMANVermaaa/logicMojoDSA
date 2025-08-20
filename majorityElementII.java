import java.util.*;
public class majorityElementII {
    public static void main(String[] args) {
        int arr[]={2,1,1,3,1,4,5,6};
        ArrayList<Integer> ls=majorityElement(arr);
        for (Integer integer : ls) {
            System.out.println(integer);
        }
    }
    static ArrayList<Integer> majorityElement(int[] arr){
        int cand1=-1;
        int cand2=-1;
        int vote1=0;
        int vote2=0;

        for (int num : arr) {
            if(cand1==num) vote1++;
            else if(cand2==num) vote2++;
            else if(vote1==0) {cand1=num; vote1++;}
            else if(vote2==0) {cand2=num; vote2++;}
            else {vote1--; vote2--;}
            
        }

        
        int count1=0;
        int count2=0;

        for (int i : arr) {
            if(cand1==i)
                count1++;
            else if(cand2==i)
                count2++;
            
        }
        ArrayList<Integer> ls = new ArrayList<>();
        if(count1>arr.length/3) ls.add(cand1);
        if(count2>arr.length/3) ls.add(cand2);

        return ls;
    
    }
}
