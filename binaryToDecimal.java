public class binaryToDecimal {
    public static void main(String args[]){
        System.out.println(bToD("111111"));
    }
    public static int bToD(String b) {
        // Code here
        int n = b.length()-1;
        
        int num=0;
        int po=0;
        while (n>=0){
            int digit=b.charAt(n)-'0';
            
            n-=1;
            num=num+(int)(digit*(Math.pow(2,po++)));
            
        }
        return num;
    }
}
