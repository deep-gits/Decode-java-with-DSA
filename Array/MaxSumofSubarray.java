package Array;

public class MaxSumofSubarray {
    public static void SubArray(int arr[]){
//        int maxsum=Integer.MIN_VALUE;
//        Brute force
//        for (int i = 0; i < arr.length; i++) {
//            int start=i;
//            for (int j = i; j < arr.length; j++) {
//                int end=j;
//                int currsum=0;
//                for (int k = start; k <= end; k++) {
//                    currsum+= arr[k];
//                }
//                System.out.println(currsum );
//                if (currsum>maxsum){
//                    maxsum=currsum;
//                }
//            }
//        }
//        System.out.println("maxsum="+maxsum);

        // prefix sum

        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0]=arr[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start=i;
            for (int j = i; j < arr.length; j++) {
                int end=j;
                currsum=start==0?prefix[end] : prefix[end]-prefix[start-1];

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
