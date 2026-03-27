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

    public static int clearIthbit(int n,int i){
        int bitmask=~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n,int i ,int newbit ){
        n=clearIthbit(n,i);
        int bitmask=newbit<<i;
        return n|bitmask;

//        if (newbit==0){
//            return clearIthbit(n,i);
//        }
//        else {
//            return setIthBit(n,i);
//        }
    }

    public static  int clearLastIthbit(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }


    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
        System.out.println(setIthBit(10,2));
        System.out.println(clearIthbit(10,2));
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearLastIthbit(15,2));

    }
}
