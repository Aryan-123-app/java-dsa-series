public class SearchingAlgo {
    
    // 1. Binary Search
    static int binarySearch(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        int mid = (start + end)/2;

        while(start <= end){
            if(target == nums[mid]){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
            mid = (start + end)/2;
        }
        // if no element found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11,23,33,34,45,55,65,77,78,80,82,90};
        int answer = binarySearch(arr, 33);
        System.out.println("Element is found at index " + answer);
    }
}
