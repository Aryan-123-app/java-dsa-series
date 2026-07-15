public class Arrays{
    public static void main(String[] args) {
        
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


        // System.out.println("Value at 0 index : " + brr[0]);
    }
}