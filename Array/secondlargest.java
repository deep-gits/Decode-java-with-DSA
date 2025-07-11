package Array;

public class secondlargest {
    public static void main(String[] args) {


        int[] arr = {12, 23, 54, 32, 86, 2, 3, 4, 5,};
        int n= arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max=Math.max(max,arr[i]);
//            if (max<arr[i]){
//                max=arr[i];
//            }

        }
        int smx=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=max){
                smx =Math.max(smx,arr[i]);

            }



        }

        System.out.println(smx+" "+max);
    }
}
