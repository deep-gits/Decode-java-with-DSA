package BitManipulation;
import java.util.*;
public class OddorEven {
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even num");
        } else{
            System.out.println("odd num");
        }
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        oddoreven(num);

    }
}
