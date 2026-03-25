package twodarray;

public class DiagonalSum {
    public static int diagonalmatrixsum(int matrix[][]){
        int sum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[i][i];

            if (i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }


        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix= {{45, 12, 89, 3, 56},{78, 23, 11, 67, 90}, {34, 55, 29, 8, 71}, {92, 14, 47, 63, 25},{6, 81, 38, 50, 19}};
        System.out.println(diagonalmatrixsum(matrix));
    }
}
