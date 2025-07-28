
import java.util.*;


public class gcd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a,b));
        sc.close();
    }
    static int findGCD(int a, int b){

        if(b==0)
            return a;

        return findGCD(b,a%b);
        
    }

}
