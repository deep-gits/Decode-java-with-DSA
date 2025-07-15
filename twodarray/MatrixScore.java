
//    class Solution {
//        public int matrixScore(int[][] arr) {
//            int m = arr.length, n = arr[0].length;
//            for(int i= 0; i<m ; i++){
//                if (arr[i][0]==0){
//                    for(int j =0; j<n; j++){
//                        if(arr[i][j]==0) arr[i][j]=1;
//                        else arr[i][j] =0;
//                    }
//
//                }
//
//            }
//
//            for(int j =1; j<n; j++){
//                int noofzeros=0, noofones=0;
//                for(int i=0; i<m; i++){
//                    if(arr[i][j]==0) noofzeros++;
//                    else noofones++;
//                }
//                if(noofzeros>noofones){
//                    for(int i=0; i<m;i++){
//                        if(arr[i][j]==0) arr[i][j]=1;
//                        else arr[i][j] =0;
//                    }
//                }
//            }
//            int score=0;
//            int x=1;
//            for(int j=n-1;j>=0;j-- ){
//                for(int i=0; i<m;i++){
//                    score+=(arr[i][j]*x);
//                }
//                x *=2;
//
//            }
//
//            return score;
//        }
//    }
package twodarray;
class matrixscore {
    public static int matrixScore(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;

        // Step 1: Ensure the first column is all 1s
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0) {
                flipRow(grid, i);
            }
        }

        // Step 2: Maximize 1s in each column
        for (int j = 1; j < cols; j++) {
            int onesCount = 0;
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount < rows - onesCount) {
                flipColumn(grid, j);
            }
        }

        // Step 3: Calculate the total score
        int score = 0;
        for (int i = 0; i < rows; i++) {
            int rowValue = 0;
            for (int j = 0; j < cols; j++) {
                rowValue = (rowValue << 1) | grid[i][j];
            }
            score += rowValue;
        }

        return score;
    }

    private static void flipRow(int[][] grid, int row) {
        for (int j = 0; j < grid[0].length; j++) {
            grid[row][j] ^= 1; // Toggle 0 to 1 and 1 to 0
        }
    }

    private static void flipColumn(int[][] grid, int col) {
        for (int i = 0; i < grid.length; i++) {
            grid[i][col] ^= 1; // Toggle 0 to 1 and 1 to 0
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };
        System.out.println("Maximum Score: " + matrixScore(matrix));
    }
}

