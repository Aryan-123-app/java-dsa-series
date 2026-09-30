import java.util.*;
public class ArrayProblems2{

    // Two Sum 
    static int[] twoSum(int[] nums, int target){
        int n = nums.length;

        for(int i = 0; i <= n-2;i++){
            for(int j = i+1; j <= n-1;j++){
                if(nums[i] + nums[j] == target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int[] result = {};
        return result;
    }

    // Three Sum
    static List<List<Integer>> threeSum(int[] nums){
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        int n = sortedNums.length;

        List<List<Integer>> output = new ArrayList<>();

        for(int i = 0; i <= n-2; i++){
            int j = i + 1 , k = n-1;

            if(i > 0 && sortedNums[i]  == sortedNums[i-1]){
                continue;
            }

            while(j < k){
                int sum = sortedNums[i] + sortedNums[j] + sortedNums[k];
                if(sum == 0){
                    output.add(Arrays.asList(sortedNums[i],sortedNums[j], sortedNums[k]));
                    j++;
                    k--;
                    while( j < k && sortedNums[j] == sortedNums[j-1]){
                        j++;
                    }
                    while(j < k && sortedNums[k] == sortedNums[k-1]){
                        k++;
                    }
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return output;
    }

    // Remove Duplicates from an Array
    static int removeDuplicates(int[] nums){
       int[] sNums = nums.clone();
       Arrays.sort(sNums);
       int n = sNums.length;
       
       int i = 0 , j = 1;

       while(j < n){
        if(sNums[i] == sNums[j]){
            j++;
        }
        else{
            i++;
            sNums[i] = sNums[j];
            j++;
        }
       }
       return i + 1;
    }

    // Find the Duplicate Number
    static int findDuplicate(int[] nums){
        HashMap<Integer,Integer> freq = new HashMap<>();
        //frequency store
        for(int num: nums){
            freq.put(num,freq.getOrDefault(num, 0) + 1);
        }
        for(int i : nums){
            if(freq.get(i) > 1){
                return i;
            }
        }
        //if no such element exists
        return -1;
    }

    // Find the Pivot Index
    static int pivotIndex(int[] nums){
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        // Left waala array
        left[0] = nums[0];
        for(int i = 1; i <= n-1; i++){
            left[i] = left[i-1] + nums[i];
        }

        //right wala array
        right[n-1] = nums[n-1];
        for(int i = n-2; i <= 0 ; i++){
            right[i] = right[i+1] + nums[i];
        }

        for(int i = 0 ; i < n; i++){
            if(left[i] == right[i]){
                return i;
            }
        }
        return -1;
    }

    //Find missing number
    static List<Integer> missingNumber(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Set<Integer> set = new HashSet<>();

        // Find min, max and store elements
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            set.add(num);
        }

        // Find missing elements
        for (int i = min + 1; i < max; i++) {
            if (!set.contains(i)) {
                ans.add(i);
            }
        }

        return ans;
    }

    // Return the sum of maximum subarray
    static int maxSubArray(int[] nums){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            sum += nums[i];
            maxi = Math.max(maxi,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(arr);
        System.out.println("Maximum Subarray: " + ans);
        
        /* List<Integer> ans = missingNumber(arr);
        System.out.println(ans); */
        
        
        /* int answer = pivotIndex(arr);
        System.out.println("Pivot Index" + answer); */
        
        
        /* int answer = findDuplicate(arr);
        System.out.println("Answer: " + answer); */



        /* int answer = removeDuplicates(arr);
        System.out.println("No. of unique values in array: " + answer); */
        
        
        /* List<List<Integer>> answer = threeSum(arr);
        System.out.println("3Sum triplets: " + answer); */

        /* int[] answer = twoSum(arr, target);
        System.out.print("Two Sum answers: ");
        for(int m : answer){
            System.out.print(m + " ");
        } */
        
    }
}