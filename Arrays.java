public class Arrays{
    public static void main(String[] args) {

        // Declaration of 2D Array
        int[][] arr ;

        // Allocation of 2D array
        arr = new int[3][4];

        // Init of 2D Array
        int[][] brr = {
                     {1,2},
                     {3,4},
                     {5,7},
                     {9,11}
        };

        //System.out.println(brr[3][1]);
        int rowLength = brr.length;
        int colLength = brr[0].length;

        for(int row = 0; row <= rowLength - 1; row++){
            for(int col = 0; col <= colLength - 1; col++ ){
                System.out.print(brr[row][col]+ " ");
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*int arr[] = {4,5,-5,21,10};

        int n = arr.length;

        int max = arr[0];
        for(int i = 0 ; i <= n-1 ; i++){
            if (arr[i] < max){
                max = arr[i];
            }
        }
 
        System.out.println("Maximum value of the given array: "+ max);
        */


        /*int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        int n = arr.length;
        int prod = 1;

        for(int i = 0; i <= n-1; i++){
            System.out.print("Enter element of index "+ i + " ");
            arr[i] = sc.nextInt();
            prod *= arr[i];
        }

        System.out.println("Product of elements of given array: " + prod);*/

    
        /*int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        int n = arr.length;

        for(int i = 0; i <= n-1 ; i++){
            System.out.print("Input for array at index " + i);
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0 ; i <= n-1; i++){
            sum += arr[i];
        }

        System.out.println("Sum of elements of array: " + sum); */
        
        /*int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        // Input
        for(int i = 0 ; i <= n - 1; i++){
            System.out.println("Provide input for index " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Array Contains: ");
        for(int val : arr){
            System.out.println(val);
        }*/
        
        
        
        /*
        // Declaration
        int arr[];

        // Allocation
        arr = new int[5];

        // Initialization
        int brr[] = {10,20,30};

        int n = brr.length;

        for(int idx = 0 ; idx <= n-1; idx ++){
            System.out.println(brr[idx]);
        }

        // For each Loop
        for(int val: brr){
            System.out.println(val);
        }*/


        // System.out.println("Value at 0 index : " + brr[0]);
    }
}