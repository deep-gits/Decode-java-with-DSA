package Array;

public class BinarySearch {
    public static int Binarysearch(int num[],int key){
        int start=0, end=num.length-1;

        while(start<=end){
            int mid= (end+start)/2;
            if(num[mid]==key){
                return mid;
            } else if (num[mid]>key) {
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,5,6,7,8,9};
        int key=8;
        System.out.println("index of key ="+ Binarysearch(num, key));
    }
}
