public class majorityElement {
    public static void main(String[] args) {
        int[] nums = {2,1,1,1,2,2};
        System.out.println(MajorityElement(nums));
    }
    static int MajorityElement(int nums[]){
        int cand=-1;
        int votes=0;

        for(int num:nums){
            if(votes==0){ 
                cand=num;
                votes++; 
            }
            else if(cand==num) {
                votes++; 
            }
            else { 
                votes--; 
            }
        }
        
        int count=0;
        for(int num:nums){
            if(cand==num) count++;
        }
        if(count>nums.length/2) return cand;
        else return -1;
    }
}
