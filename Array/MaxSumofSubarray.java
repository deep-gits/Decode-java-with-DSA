package Array;

public class MaxSumofSubarray {
    public static void SubArray(int arr[]){
        int maxsum=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                int currsum=0;
                for (int k = start; k <= end; k++) {
                    currsum+= arr[k];


                }
                System.out.println(currsum );
                if (currsum>maxsum){
                    maxsum=currsum;
                }


            }


        }
        System.out.println("maxsum="+maxsum);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        SubArray(arr);

    }
}
