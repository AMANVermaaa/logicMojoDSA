public class powerOf2 {
    public static void main(String[] args) {
        int n=1;
        System.out.println(poweroftwo(n));
    }
    static boolean poweroftwo(int n){
        if((n>0) && (n & (n-1))==0)
            return true;
        return false;
    }
}
