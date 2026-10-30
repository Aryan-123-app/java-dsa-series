import java.util.*; 



public class SortingAlgo {
    
    // 1. Bubble Sort
    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // 2. Selection Sort
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int min_idx = i;
            for(int j = i + 1; j < n; j++){;
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            }
        }
    }

    // 3. Insertion Sort
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int curr = i;
            int prev = i - 1;
            int currVal = arr[curr];

            while(prev >= 0 && currVal < arr[prev]){
                //Shifting the elements
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // place the element in the gap
            arr[prev + 1] = currVal;
        }
    }

    // 4. Sort Colors
    static void sortColors(int[] nums){
        // Solved using Dutch National Flag Algorithm
        int n = nums.length;
        int left = 0, mid = 0, right = n - 1;

        while(mid <= right){
            if(nums[mid] == 0){
                swap(nums,left,mid);
                left++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,right);
                right--;
            }
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 5. Sort an Linked List


    public static void main(String[] args) {
        //int[] arr = {5,7,4,1};
        int[] flg = {2,2,1,2,0,0,1,0,0,2,1,2,1,0,2};
        System.out.println("Unsorted Array: " + Arrays.toString(flg));
        //bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
        sortColors(flg);
        System.out.println("Sorted Array: " + Arrays.toString(flg));
    }
}
