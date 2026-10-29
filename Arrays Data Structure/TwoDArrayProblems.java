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

    // 5. Rotate the Matrix Clockwise by 90 Degree
    static int[][] rotateby90(int[][] matrix){
        int n = matrix.length;

        int start = 0;
        int end = n - 1;

        while(start < end){
            for(int col = 0 ; col < n ; col++){
                int temp = matrix[start][col];
                matrix[start][col] = matrix[end][col];
                matrix[end][col] = temp;
            }
            start++;
            end--;
        }

        for(int row = 0; row < n; row++){
            for(int col = row + 1; col < n; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        return matrix;
    }

    // 6. Execute Spiral Print of a Matrix
    static List<Integer> spiral(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int startrow = 0;
        int endrow = m - 1;
        int startcol = 0;
        int endcol = n - 1;

        while(startrow <= endrow && startcol <= endcol){
            for(int i = startcol; i <= endcol; i++){
                // Print a row L -> R
                result.add(matrix[startrow][i]);
            }
            startrow++;

            for(int i = startrow; i <= endrow; i++){
                // Print a col T -> B
                result.add(matrix[i][endcol]);
            }
            endcol--;

            if(startrow <= endrow){
                // Print a row R -> L
                for(int i = endcol; i >= startcol; i--){
                    result.add(matrix[endrow][i]);
                }
                endrow--;
            }

            if(startcol <= endcol){
                // Print a col B -> T
                for(int i = endrow; i >= startrow; i--){
                    result.add(matrix[i][startcol]);
                }
                startcol++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> answer = spiral(arr);
        System.out.println("Spiral Print of Matrix: " + answer);
        /* int[][] answer = rotateby90(arr);
        System.out.println(answer); */
        /* int[][] answer = transpose(arr);
        System.out.println(answer); */
        
        /* List<Integer> answer = wavePrint(arr, 3, 3);
        System.out.println(answer); */


        /* List<Integer> answer = colSum(arr);
        System.out.println("Column Sum of 2D Array: " + answer); */

        /* List<Integer> answer = rowSum(arr);
        System.out.println("Row Sum of 2D Array: " + answer); */
    }
}
