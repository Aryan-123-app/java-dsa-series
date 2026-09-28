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

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int answer = removeDuplicates(arr);
        System.out.println("No. of unique values in array: " + answer);
        
        
        /* List<List<Integer>> answer = threeSum(arr);
        System.out.println("3Sum triplets: " + answer); */

        /* int[] answer = twoSum(arr, target);
        System.out.print("Two Sum answers: ");
        for(int m : answer){
            System.out.print(m + " ");
        } */
        
    }
}