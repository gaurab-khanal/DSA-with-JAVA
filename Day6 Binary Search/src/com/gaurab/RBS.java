public class RBS {
    // https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you didnt find the pivot, it means the array is not rotated
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length -1);
        }

        // if pivot is found you have found two ascending sorted array

        if(nums[pivot] == target){
            return pivot;
        }

        if (target>=nums[0]){
            return binarySearch(nums,target, 0, pivot-1);
        }

        return binarySearch(nums, target, pivot+1, nums.length -1);


    }

    static int binarySearch(int[] arr, int target, int start , int end){

        while(start<=end){
            //find the middle element
            // int mid = (start + end)/2; // might be possibe that (start + end) exceed the range of integer in java
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            } else{
                // ans found
                return mid;
            }
        }
        return -1;
    }

    // this will not work for duplicate values
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;;

        while(start<=end){
            // 4 cases over here
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;
            } else if (arr[0]>= arr[mid]) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;;

        while(start<=end){
            // 4 cases over here
            int mid = start + (end-start)/2;

            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            } else if (mid > start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates

            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < (arr.length-1) && arr[start]>arr[start + 1]){
                    return start;
                }
                start++;

                // check whether end is pivot or not
                if(end >0 &&  arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }

            // left side is sorted, so pivot should be in rght
            else if ((arr[start]< arr[mid]) ||  (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
                
            }else {
                end = mid - 1;
            }

        }
        return -1;
    }

}
