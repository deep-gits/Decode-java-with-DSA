package Array;

public class maxvaluefind {
    public static void main(String[] args) {
        int[] arr={12,34,54,1,45,90};
        int n=arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max=Math.max(max,arr[i]);
//            if (max<arr[i]){
//                max=arr[i];
//            }

        }
        System.out.println("maximum value in array" + max);

    }
}
