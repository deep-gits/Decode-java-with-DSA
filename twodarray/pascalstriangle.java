package twodarray;// Java program for Pascal's Triangle using Binomial
// Coefficient in O(n^3) and O(1) Space 

import java.util.*;

class GfG {

    static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    // Function to print first n rows 
    // of Pascal's Triangle 
    static List<List<Integer>> printPascal(int n) {
        List<List<Integer>> mat = new ArrayList<>();

        // Iterate through every row and
        // print entries in it
        for (int row = 0; row < n; row++) {
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i <= row; i++)
                arr.add(binomialCoeff(row, i));
            mat.add(arr);
        }
        return mat;
    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> mat = printPascal(n);
        for (int i = 0; i < mat.size(); i++) {
            for(int j = 0; j < mat.get(i).size(); j++) {
                System.out.print(mat.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}