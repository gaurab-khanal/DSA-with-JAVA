import java.sql.Array;
import java.util.Arrays;

public class BS2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target = 37;

        int[] ans = BS(arr, target );

        System.out.println(Arrays.toString(ans));

    }

    static int[] BS(int[][] arr, int target){

        int row = 0;
        int col = arr.length -1;

        while (row< arr.length && col > 0){

            if(target  > arr[row][col]){
                row++;
            }else if(target< arr[row][col]){
                col--;
            }else{
                return new int[] {row, col};
            }

        }

        return  new int[] {-1, -1};
    }
}
