public class basicMaths {
    static int sumdigits(int num){
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
    static int countdigits(int num){
        int count = 0;
        while(num > 0){
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }
    static void printdigits(int num){
        while(num > 0){
            int digit = num % 10;
            System.out.println(digit);
            num = num / 10;
        }
    }
    static int reverseNum(int num){
        int revNum = 0;
        while(num != 0){
            int digit = num % 10;
            //reverselogic
            int ans = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }
    static boolean isPalindrome(int num){
        int original = num;
        int reversednum = reverseNum(num);
        if(original == reversednum){
            System.out.println("It is a Palindrome");
            return true;
        } else{
            System.out.println("It is not a Palindrome");
            return false;
        }
    }
    static boolean prime(int num){
        for(int i = 2; i*i <= num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    static int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int ans = a;
        return ans;
    }

    static int LCM(int a, int b){
        int gcd = gcd(a, b);
        int prod = a * b;
        int lcm = prod / gcd;
        return lcm;
    }
    static boolean armstrong(int num){
        int origin = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            int cube = digit*digit*digit;
            sum += cube;
            num = num / 10;
        }
        if(sum == origin){
            System.out.println("Armstrong number");
            return true;
        }else{
            return false;
        }
    }

    static boolean isPerfect(int num){
        int sum = 1;
        for(int i = 2; i*i <= num ; i++){
            if( num%i == 0){
                int firstFactor = i;
                int secondFactor = num / i;
                sum += firstFactor + secondFactor;
            }
        }
        if(sum == num){
            return true;
        }else{
            return false;
        }
    }

    static void primelist(int num){
        for(int i = 2; num <= i; i++){
            boolean isPrime = prime(num);
            if(isPrime == true){
                System.out.println(num);
            }
        }
    }
    public static void main(String[] args) {

        primelist(10);

        //System.out.println(isPerfect(6));

        //System.out.println(armstrong(153));

        /* System.out.println(LCM(18, 12));
        System.out.println(gcd(18, 12)); */

       /*  int num = 18;
        System.out.println(prime(13)); */

        /* int n = 436478;
        int ans = reverseNum(n);
        System.out.println("Reverse Num: " + ans); */
    /*  int n = 53127;
     /* printdigits(n); */
     /*int ans = sumdigits(n);
     System.out.println("Sum of digits: " + ans); */   
    }
}
