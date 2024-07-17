import java.sql.Array;
import java.util.Arrays;

public class Sorted2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50},
        };
        int target = 7;

        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    // Search in the row provided betweens the cols provided
    static  int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while (colStart<=colEnd){
            int mid = colStart + (colEnd-colStart)/2;
            if(matrix[row][mid]==target){
                return  new int[] {row,mid};
            }
            if(matrix[row][mid]<target){
                colStart = mid +1;
            }else {
                colEnd = mid-1;
            }
        }
        return  new int[] {-1,-1};
    }
    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows==0 || cols==0) {
            return new int[]{-1,-1};
        }

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rowStart = 0;
        int rowEnd = rows-1;
        int midCol = cols/2;

        // run the loop till two rows are remaining
        while (rowStart < (rowEnd-1)) { // while this is true it will have more than two rows
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][midCol] == target) {
                return new int[]{mid, midCol};
            }
            if (matrix[mid][midCol] < target) {
                rowStart = mid;
            } else if (matrix[mid][midCol] > target) {
                rowEnd = mid;
            }
        }

        // Now we have two rows
        // check whether the target is in the midCol of two rows;
        if(matrix[rowStart][midCol] == target){
            return  new int[] {rowStart, midCol};
        }
        if(matrix[rowStart+1][midCol] == target){
            return  new  int[] {rowStart+1, midCol};
        }

        // search in 1st half
        if(target<=matrix[rowStart][midCol-1]){
            return  binarySearch(matrix, rowStart, 0, midCol-1 ,target);
        }
        // search in 2nd half
        if(target<=matrix[rowStart+1][midCol-1]){
            return  binarySearch(matrix, rowStart+1, 0, midCol-1,target);
        }
        // search in 3rd half
        if(target>=matrix[rowStart][midCol+1] && target<= matrix[rowStart][cols-1]){
            return  binarySearch(matrix, rowStart, midCol+1, cols-1,target);
        }
        // search in 4th half
        if(target>=matrix[rowStart+1][midCol+1]){
            return  binarySearch(matrix, rowStart+1, midCol+1, cols-1,target);
        }


        return  new int[]{-1,-1};
    }
}
