package twodarray;

public class searchin2dmatrix {

    // Function to search for a target in a sorted 2D matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Start from top-right corner
        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println("Element found at (" + row + ", " + col + ")");
                return true;
            } else if (matrix[row][col] > target) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }

        System.out.println("Element not found.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {8, 9, 10, 20},
                {11, 12, 17, 30},
                {18, 21, 23, 40}
        };

        int target = 17;
        searchMatrix(matrix, target);
    }
}
