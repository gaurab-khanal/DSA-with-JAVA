public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(countRotations(arr));
    }

     static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
         System.out.println(pivot);
        return pivot + 1;
    }

    // for non duplicates
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


    // for duplicates

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
                // what is these alements at start and end were the pivot??
                // check if start is pivot
                if (arr[start]>arr[start + 1]){
                    return start;
                }
                start++;

                // check whether end is pivot or not
                if(arr[end] < arr[end-1]){
                    return end;
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
