public class sieve {
    public static void main(String args[]){
        int num=10;
        int [] arr = sieve1(num);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sieve1(int n) {
        // code here
        boolean[] arr = new boolean[n+1];

        for(int i=0;i<=n;i++){
            arr[i]=true;
        }
        int count=0;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(isPrime(i)){
                
                for(int j=i+i; j<=n; j+=i){
                    if(arr[j]!=false){
                        arr[j] =false;
                        count++;
                    }
                }
            }
        }
        
        int idx=0;
        int[] prime = new int[(n-1)-count];
        for(int i=2;i<=n;i++){
            
            
            if(arr[i]==true)
                prime[idx++]=i;
            
        }
        return prime;
        
    }
    public static boolean isPrime(int a){
        
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        
        return true;
        
    }
}

class Solution {
    public int[] sieve(int n) {
        // code here
        int[] arr = new int[n];
        int count=0;
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(isPrime(i)){
                arr[i]=i;
                for(int j=i+i; j<=n; j+=i){
                    arr[j]=0;
                }
            }
            else{
                
            }
        }
        return arr;
        
    }
    public boolean isPrime(int a){
        
        for(int i=0;i<Math.sqrt(i);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}