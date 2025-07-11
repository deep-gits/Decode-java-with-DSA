package Array;

public class marks {
    public static void main(String[] args) {
        int[] arr={12,34,53,67,89,12,21,32};
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]<13){
                System.out.println(i+" ");
            }

        }
    }
}
