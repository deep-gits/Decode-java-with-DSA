package BitManipulation;

public class CountSetBit {
    public static int countsetBits(int n){
        int cout=0;
        while(n>0){
            if ((n&1)!=0){
                cout++;
            }
            n>>=1;
        }
        return cout;
    }
    public static void main(String[] args) {
        System.out.println(countsetBits(4));
    }
}
