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

        int row = 0;
        int target = 37;
        for(int i = 0; i<arr.length; i++){
            if(target<=arr[i][arr[i].length-1] && target>= arr[i][0]){
                row = i;
            }
        }

        int[] ans = BS(arr, target, 0, arr[row].length-1, row );

        System.out.println(Arrays.toString(ans));

    }

    static int[] BS(int[][] arr, int target, int start, int end,int row){

        while (start<=end){
            int mid  = start + (end-start)/2;

            if(target  > arr[row][mid]){
                start = mid +1;
            }else if(target< arr[row][mid]){
                end = mid -1;
            }else{
                return new int[] {row, mid};
            }

        }

        return  new int[] {-1, -1};
    }
}
