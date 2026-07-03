public class Methods {
    static void print2katable() {
        for(int i = 1 ; i <= 10 ; i++){
            int ans = 2*i;
            System.out.println("-> " + ans);
        }
    }

    static void addition(int a , int b) {
        int sum = a + b ;
        System.out.println("SUM: " + sum);
    }

    static void multiply(int x , int y) {
        int res = x * y;
        System.out.println("Result: " + res);
    }

    static int sum (int p , int q){
        int sum = p + q;
        return sum;
    }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b , int c){
        return a + b + c;
    }

    static void solve(int num) {
        System.out.println("Inside solve:" +  num);
        num = num * 10;
        System.out.println("Inside solve : " + num);
    }

    public static void main(String[] args) {
        /*System.out.println("Good Evening");
        print2katable();
        System.out.println("Bye");
        */

        //addition(3,5);

        //multiply(4,12);

        //int answer = sum(10,20);
        //System.out.println("Ans: " + answer);

        /*int result1 = add(2,4);
        System.out.println("Result 1: " + result1);
        int result2 = add(2,3,4);
        System.out.println("Result 2: " + result2);
        */
        int num = 6;
        System.out.println("Inside main: " + num);
        solve(num);
        System.out.println("Inside main: " + num);

    }
}