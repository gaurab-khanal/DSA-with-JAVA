public class SearchInMountain {
    //https://leetcode.com/problems/find-in-mountain-array/
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,3,1};

        System.out.println(search(arr, 3));
    }

    static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr,target, 0, peak); // search for ascending

        if(firstTry != -1){
            return firstTry;
        }
        // try to search in second half
        return binarySearchDes(arr, target, peak+1, arr.length-1);

    }

    static int binarySearchDes(int[] arr, int target, int start, int end){

        while (start<=end){
            // find middle element
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                start = mid + 1;
            }else if (target > arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length -1;

            while(start!=end){
                int mid = start + (end - start)/2;

                if(arr[mid]>arr[mid+1]){
                    // you are in decreasing part of array
                    // this may be the amswer, but look at left
                    // this is why end != mid -1
                    end = mid;
                }else if(arr[mid]<arr[mid+1]) {
                    //you are in ascending part of array
                    start = mid + 1; // becaue we know that mid + 1 element > mid element
                }
            }
            // in the end, start == end and pointing to the largest number because of the
            // two checks above, start and end are always trying to find max element
            // in the above 2 checks
            // hence, when they are pointing to just one element that is the maximum one
            // because that is what the checks says.
            // more elaboration : at every point of time for start and end, they have the best possible answer
            // till that time
            // and if we are saying that only one item is remaining, hence because of the above line that is the best
            // possible answer
            return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end){


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
}
