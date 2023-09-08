public class Mountain {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};

        System.out.println(peakIndexInMountainArray(arr));
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
}
