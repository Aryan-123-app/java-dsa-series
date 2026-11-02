public class SearchingAlgo {
    
    // 1. Binary Search
    static int binarySearch(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        int mid = start + (end - start)/2; // To avoid Integer Overflow

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
            mid = start + (end - start)/2;
        }
        // if no element found
        return -1;
    }

    // 2. Get Lower Bound of a Sorted Array
    static int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n; // to handle edge cases

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] >= target){
                //answer is stored temporarily
                ans = mid;
                //move to left
                e = mid - 1;
            }
            else{
                // right move
                s = mid + 1;
            }
        }
        return ans;
    }

    // 3. Get Upper Bound of an Sorted Array
    static int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n; // to handle edge cases

        while(s <= e){
            int mid = s + (e - s)/2;
            
            if(arr[mid] <= target){
                s = mid + 1;
            }
            else{
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }

    // 4. Total Number of Occurence
    static int noOccur(int[] arr, int target){
        int lbound = getLowerBound(arr, target);
        int ubound = getUpperBound(arr, target);
        int ans = ubound - lbound;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,30,30,30,30,40,50};
        int target = 30;
        int res = noOccur(arr, target);
        System.out.println("No. of Occurences: " + res);


        //int answer = getLowerBound(arr, target);
        //System.out.println("Lower bound index: " + answer);

        //int answer = binarySearch(arr, target);
        //System.out.println("Element is found at index " + answer);
    }
}
