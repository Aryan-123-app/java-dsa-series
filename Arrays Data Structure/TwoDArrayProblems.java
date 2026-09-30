import java.util.*;
public class TwoDArrayProblems {

    // 1. Print the sum of each row in a 2d array
    static List<Integer> rowSum(int[][] nums){
        List<Integer> result = new ArrayList<>();

        int m = nums.length; 
        int n = nums[0].length;

        for(int row = 0; row < m; row++){
            int sum = 0;
            for(int col = 0; col < n ; col++){
                int value = nums[row][col];
                sum += value;
            }
            result.add(sum);
        }
        return result;
    }

    // 2. Column wise sum of a 2d Array
    static List<Integer> colSum(int[][] nums){
        List<Integer> result = new ArrayList<>();
        int m = nums.length;
        int n = nums[0].length;

        for(int col = 0; col < n; col ++){
            int sum = 0;
            for(int row = 0; row < m; row++){
                int value = nums[row][col];
                sum += value;
            }
            result.add(sum);
        }
        return result;
    }

    // 3. Print wave form of a 2D matrix
    static List<Integer> wavePrint(int[][] nums,int m,int n){
        List<Integer> result = new ArrayList<>();

        for(int col = 0 ; col < n; col++){
            //check for col if it is even /odd
            if((col & 1) == 1){
                //odd
                for(int row = m - 1; row >= 0; row--){
                    result.add(nums[row][col]);
                }
            }
            else{
                //even
                for(int row = 0; row < m; row++){
                    result.add(nums[row][col]);
                }
            }
        }
        return result;
    }

    // 4. Transpose of a Matrix
    static int[][] transpose(int[][] nums){
        if(nums == null || nums.length == 0){
            return new int[0][0];
        }

        int m = nums.length;
        int n = nums[0].length;

        int m_new = n;
        int n_new = m;

        int[][] result = new int[m_new][n_new];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                result[j][i] = nums[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] answer = transpose(arr);
        System.out.println(answer);
        
        /* List<Integer> answer = wavePrint(arr, 3, 3);
        System.out.println(answer); */


        /* List<Integer> answer = colSum(arr);
        System.out.println("Column Sum of 2D Array: " + answer); */

        /* List<Integer> answer = rowSum(arr);
        System.out.println("Row Sum of 2D Array: " + answer); */
    }
}
