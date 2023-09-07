public class ElementInInfiniteSortedArray {
    public static void main(String[] args) {
        // start with the box of size
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170,188,199,200,250,290};

        int target = 100;

        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target){
        //first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target>arr[end]){
            int newStart = end+1;
            // double the box value
            // end = previousEnd + sizeOfBox * 2
            end = end + (end-start+1) * 2;
            start = newStart;
        }

        return binarySearch(arr,target,start,end);
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
