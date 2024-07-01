import java.util.Arrays;

public class FirstAndLastElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int[] ans = new int[2];
        ans = searchRange(arr, 7);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        //check for first occurence of target first

        ans[0] = search(nums,target,true);
        if(ans[0] != -1) ans[1] = search(nums,target,false);



        return ans;
    }
    //this function just return the index value of target

    public  static int search(int[] nums, int target, boolean findStartIndex){
        //potential ans
        int ans = -1;
        //check for first occurence of target first
        int start = 0;
        int end = nums.length - 1;

        while(start<=end) {
            //find the middle element
            // int mid = (start + end)/2; // might be possibe that (start + end) exceed the range of integer in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
