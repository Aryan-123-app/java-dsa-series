public class ArraysProblems1 {

    // 1. Sort an Array of 0s and 1s - O(n)
    public static int[] sortArray(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while( i < j){
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
            }
            if(arr[i] == 0)
                i++;
            if(arr[j] == 1)
                j--;
        }
        return arr;
    }

    // 2. Find the Missing Number from the array
    public static int missingNo(int[] arr){
        int xorSum = 0;
        //xor with all the array elements
        for(int num : arr){
            xorSum = xorSum ^ num;
        }
        //xor with all the element in the range - O(n)
        int n = arr.length;
        for(int i = 0; i <= n ; i++){
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }

    // 3. Find the Unique Element in an Array
    public static int findUniqueElement(int[] nums){
        int xorSum = 0;
        for(int num : nums){
            xorSum = xorSum ^ num;
        }
        return xorSum;
    }

    // 4. Shift the array elements by k positions
    public static int[] shiftByK(int[] arr, int k){
        int n = arr.length;

        //Handle k > n
        k = k % n;

        int[] temp = new int[n];

        for(int i = 0; i < n ; i++){
            temp[(i+k) % n] = arr[i];
        }
        return temp;
    }

    public static void main(String[] args) {

        int[] nums = {4,6,2,7,1,5,8};
        int[] res = shiftByK(nums, 2);
        for(int e: res){
            System.out.print(e + " ");
        }
        
        /* int[] nums = {2,3,5,4,5,3,4};
        int ans = findUniqueElement(nums);
        System.out.println("Unique Element: "+ ans); */

        /* int[] nums = {1,3,0,4};
        int ans = missingNo(nums);
        System.out.println("Missing No: "+ ans); */

        /*int[] nums = {0,1,0,0,1,1,0,0,1,1};
        int[] ans = sortArray(nums);
        for( int e : ans){
            System.out.print(e + " ");
        }*/
    }
}
