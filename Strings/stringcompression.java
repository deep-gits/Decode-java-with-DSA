package Strings;

public class stringcompression {
    public static void main(String[] args) {
        String s="aaaaaggggggfffffddsseee";
        char[] arr=s.toCharArray();
        String ans ="";
        int i=0,j=0;
        while(j< arr.length){
            if (arr[j]==arr[i]) j++;
            else{
                ans+= arr[i];
                int len=j-i;
                if(len>1) ans+=len;
                i=j;
            }
        }
        ans+= arr[i];
        int len=j-i;
        if(len>1) ans+=len;
        System.out.println(ans);

    }
}
