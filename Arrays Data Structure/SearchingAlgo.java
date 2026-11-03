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

    // 5. Find Peak Index in a Mountain Array
    static int peakIndex(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

        while(s <= e){
            int mid = s + (e - s)/2;

            if(arr[mid] >= arr[mid + 1]){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }

    // 6. Finding Pivot Index in a Sorted Array
    static int pivotIndex(int[] arr){
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        int ans = n;

        if(arr[s] < arr[e]){
            // No effective rotation
            return -1;
        }

        while(s <= e){
            int mid = s + (e-s)/2;

            if(arr[mid] <= arr[n-1]){
                // it means we are in L2.
                // Ans is in L1.
                e = mid - 1;
            }
            else{
                // It means we are in L1.
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    // 7. Search in a Rotated Sorted Array
    static int search(int[] nums, int target){
        int n = nums.length;
        int s = 0 , e = n - 1;

        while(s <= e){
            int mid = s + (e - s)/2;

            if(nums[mid] == target){
                return mid;
            }

            // Check if left part is sorted
            if(nums[mid] >= nums[s]){
                if(target >= nums[s] && target < nums[mid]){
                    e = mid - 1; // move left
                }
                else{
                    s = mid + 1; // move right
                }
            }
            
            // Check if right part is sorted
            else{
                if(target <= nums[e] && target > nums[mid]){
                    s = mid + 1; // move right
                }
                else{
                    e = mid - 1; // move left
                }
            }
        }

        // If not found 
        return -1;
    }

    // 8. Search in a Rotated Sorted Array II
    static boolean searchTwo(int[] nums, int target){
        int n = nums.length;
        int s = 0, e = n - 1;

        while(s <= e){
            int mid = s + (e - s)/2;

            if(target == nums[mid]){
                return true;
            }

            if(nums[mid] == nums[s] && nums[mid] == nums[e]){
                s++;
                e--;
            }
            
            // check if left part is sorted
            else if(nums[mid] >= nums[s]){
                if(target >= nums[s] && target < nums[mid]){
                    e = mid - 1; // move left
                }
                else{
                    s = mid + 1; // move right
                }
            }

            // check if right part is sorted
            else{
                if(target <= nums[e] && target > nums[mid]){
                    s = mid + 1; // move right
                }
                else{
                    e = mid - 1; // move left
                }
            }
        }
        
        // if element not found
        return false;
    }

    // 9. Finding Minimum element in a Rotated Sorted Array
    static int findMin(int[] nums){
        int n = nums.length;
        int s = 0, e = n - 1;

        while(s < e){ // Equal sign is removed to avoid infinte Time Complexity
            int mid = s + (e - s)/2;

            if(nums[mid] <= nums[e]){
                e = mid;
            }
            else{
                s = mid + 1;
            }
        }
        return nums[s];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int min = findMin(arr);
        System.out.println("Minimum: " + min);

        /* int res = search(arr, 0);
        System.out.println("Element found at index: " + res); */

        /* int res = pivotIndex(arr);
        System.out.println("Pivot Index: " + res); */

        /* int res = peakIndex(arr);
        System.out.println("Peak Index = " + res); */
        
        
        /*int target = 30;
        int res = noOccur(arr, target);
        System.out.println("No. of Occurences: " + res);*/


        //int answer = getLowerBound(arr, target);
        //System.out.println("Lower bound index: " + answer);

        //int answer = binarySearch(arr, target);
        //System.out.println("Element is found at index " + answer);
    }
}
