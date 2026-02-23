package Array;

public class PrintPairs {
    public static void printpairs(int num[]){
        int tp=0;
        for (int i = 0; i < num.length; i++) {
            int cur =num[i];
            for (int j = i+1; j < num.length; j++) {
                System.out.print("("+cur+","+num[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("TotalPairs="+tp);
    }
    public static void main(String[] args) {
        int num[]={2,4,5,6,7};
        printpairs(num);

    }
}
