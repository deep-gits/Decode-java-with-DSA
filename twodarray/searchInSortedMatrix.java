package twodarray;

class searchInSortedMatrix{
    public static boolean  searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midElement = matrix[mid / n][mid % n];

            if (midElement == target) {
                return true; // Found the target
            } else if (midElement < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return false; // Target not found
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,5},{8,12,13,19},{21,32,34,56},{67,68,89,90}};
        int target=13;
        System.out.println(searchMatrix(matrix,target));
    }
}