package BitManipulation;

public class OperationsOnIthbit {
    public static int getIthBit(int n,int i){
        int bitmask=1<<i;
        if ((n&bitmask)==0){
            return 0;
        }else return 1;
    }

    public static int setIthBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }


    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,2));

    }
}
