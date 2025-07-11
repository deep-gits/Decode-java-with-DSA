package twodarray;

public class addtwomatrices {
    public static void main(String[] args) {
        int[][] a= {{1,2,4},{3,4,2},{8,9,7}};
        int[][] b= {{9,8,7},{6,5,4},{2,3,4}};
        int m= a.length;
        int n =b[0].length;
        int[][] res =new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j]=a[i][j]+ b[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
