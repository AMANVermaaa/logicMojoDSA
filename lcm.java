public class lcm {
    public static void main(String args[]){
        int[] arr = {2,7,3,9,4};

        System.out.print("LCM of the array is:" +findlcm(arr));
    }
    static int findlcm(int[] arr){
        int lcm=arr[0];

        for(int i=0;i<arr.length;i++){
            // int a=lcm;
            // int b=arr[i];
            int gcd = findGCD(lcm,arr[i]);
            lcm=(lcm*arr[i])/gcd;
        }
        return lcm;
    }
    static int findGCD(int a, int b){
        if(b==0) return a;
        return findGCD(b,a%b);
    }
}
