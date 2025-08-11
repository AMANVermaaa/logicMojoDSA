public class getSetClearIthBit {
    public static void main(String[] args) {
        int num=70;
        int i=2;    //it is zero based indexing
        System.out.print(getIthBit(num,i)+" "+setIthBit(num,i)+" "+clearIthBit(num,i));
    }
    static int getIthBit(int num, int i){
        if( (num & (1<<i))==0)
            return 0;
        return 1;
    }
    static int setIthBit(int num, int i){
        return (num | (1<<i));
    }
    static int clearIthBit(int num, int i){
        return (num & ~(1<<i));
    }

}
