package BasicSorting;

public class CheckIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,10,34};
        int n=arr.length;
        boolean flag= true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i+1]) {
                flag=false;
                break;

            }
        }
        if(flag==true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
