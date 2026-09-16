import java.util.*;

public class BasicProblems{
    // 1. Get Average of elements in an array.
    static double getAverage(int[] arr){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    // 2. Multiply each element of array by 10.
    static int[] MultiplyBy10(int[] arr){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i = 0; i < size; i++){
            int element = arr[i];
            int newElement = element * 10;
            newArray[i] = newElement;
        }
        return newArray;
    }

    // 3. Search for an element in an Array (Linear Search)
    static boolean LinearSearch(int[] arr, int x){
        int size = arr.length;

        for(int i = 0; i < size; i++){
            if(x == arr[i]){
                return true;
            }
        }
        return false;
    }

    // 4. Find the Maximum element in an array
    static int maxElement(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // 5. Return Sum of +ve and -ve numbers
    static int[] signSum(int arr[]){
        int pos = 0;
        int neg = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                pos += arr[i];
            }
            else{
                neg += arr[i];
            }
        }
        int ans[] = {pos,neg};
        return ans;
    }

    // 6. Count the number of Zeroes and Ones
    static int[] countBits(int arr[]){
        int one = 0;
        int zero = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0)
                zero += 1;
            else
                one += 1;
        }
        int sol[] = {zero, one};
        return sol;
    }

    // 7. Find first Unsorted Element in an array
    static int firstUnsorted(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] >= arr[i+1]){
                return arr[i+1];
            }
        }
        return -1;
    }

    // 8. Swap Alternate Elements in an Array
    static int[] alternate(int[] arr){
        for(int i = 0; i < arr.length; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        int[] value = arr;
        return value;
    }

    // 9. Intersecting Element in Array
    static void intersection(int[] arr1, int[] arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;

        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if((arr1[i] ^ arr2[j]) == 0){
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }

    // 10. Alternate Extreme Elements
    static void alternateExtreme(int[] arr){
        for(int i = 0; i < arr.length/2; i++){
            System.out.print(arr[i] + " ");
            System.out.print(arr[arr.length-1-i] + " ");
        }
    }

    // 11. Reverse an Array
    static int[] reverse(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n - 1;

        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    // 12. Shift Array elements by 1 position
    static void rightShift(int[] arr){
        int n = arr.length;
        int temp = arr[n-1];

        for(int i = n - 1; i > 0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }

    // 13. Printing Alternate another logic
    static void printAlternate(int[] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while( i <= j){
          if(i == j){
            System.out.println(arr[i]);
            return;
          }
          else{
            System.out.print(arr[i] +  " ");
            i++;
            System.out.print(arr[j] + " ");
            j--;
          }
        }
    }

        // 14. Identify mode for given array
        static int getMode(int arr[]){
            HashMap<Integer,Integer> freq = new HashMap<>();
            for(int num : arr){
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            int maxFreq = -1;
            int maxFreqkey = -1;
            for(int key: freq.keySet()) {
                int currentKey = key;
                int currentKeyFreq = freq.get(key);
                if( currentKeyFreq > maxFreq){
                    maxFreq = currentKeyFreq;
                    maxFreqkey = currentKey;
                }
            }
            return maxFreqkey;
        
    }

    // 15. Identify the highest and lowest frequency element
    static int[] getHighestLowestFreqElement(int arr[]){
        HashMap<Integer,Integer> fq = new HashMap<>();

        for(int num : arr){
            fq.put(num, fq.getOrDefault(num,0) + 1);
        }

        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for(int key: fq.keySet()){
            int currentKey = key;
            int currentKeyFreq = fq.get(key);
            if(currentKeyFreq > highestFreq){
                highestFreq = currentKeyFreq;
                highestNum = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for(int key: fq.keySet()){
            int currentKey = key;
            int currentKeyFreq = fq.get(key);
            if(currentKeyFreq > highestFreq){
                lowestFreq = currentKeyFreq;
                lowestNum = currentKey;
            }
        }
        int ans[] = {highestNum,lowestNum};
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,2,3,3,3,4,4,5,5,5,5,5,6};
        int ans[] = getHighestLowestFreqElement(arr);
        System.out.println("Highest Frequency: " + ans[0]);
        System.out.println("Lowest frequency: " + ans[1]);

        /*int ans = getMode(arr);
        System.out.println("Mode: " + ans);*/



        //printAlternate(arr);
        
        
        /*rightShift(arr);
        for(int a: arr){
            System.out.print(a + " ");
        }*/

        /*int[] reverse = reverse(arr);

        for(int e : reverse){
            System.out.print(e + " ");
        }*/
        
        //alternateExtreme(arr);
        
        
        /*int arr1[] = {2,3,9,5};
        int arr2[] = {3,4,9,7};
        intersection(arr1, arr2);*/
        
        
        
        /*int value[] = alternate(arr);
        for(int ele: value){
            System.out.print(ele + " ");
        }*/


        //System.out.println("First Unsorted Element: " + firstUnsorted(arr));
        
        
        /*int sol[] = countBits(arr);
        System.out.println("0s: " + sol[0] + " 1s: " + sol[1]);*/
        
        
        
        /*int ans[] = signSum(arr);
        System.out.println("Positive Sum: " + ans[0]);
        System.out.println("Negative Sum: " + ans[1]);*/


        //System.out.println("Maximum element: " + maxElement(arr));

        /*boolean ans = LinearSearch(arr, 2);
        if(ans == true)
            System.out.println("Element found");
        else
            System.out.println("Element Not Found");*/
        
        
        /*int ans[] = MultiplyBy10(arr);
        System.out.print("New Array : ");
        for(int i : ans){
            System.out.print(i + " ");
        }*/


        /*int[] arr = {2,4,3,3};
        System.out.println("Average: " + getAverage(arr));*/
    }
}