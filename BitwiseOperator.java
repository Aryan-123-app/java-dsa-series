import java.util.*;
public class BitwiseOperator {
    public static void main(String[] args) {
        /* 
        int a = 5;
        int b = 6;

        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a | b));
        System.out.println("Bitwise EXOR: " + (a ^ b));
        System.out.println("Bitwise NOT of a: " + (~a));
        System.out.println("Bitwise NOT of b: " + (~b));*/

        // 1's Complement -> NOT(a)
        // 2's Complement -> 1 + 1's Complement

        //Left-most bit is called Most Significant bit / Sign Bit
        //Right-most bit is called Least Significant bit .

        //If sign bit is 0 -> then number is positive , if sign bit is 1 -> then number is negative.

        // "<<" -> left shift binary operator; it shifts the bits towards left n times .
        //Mathematically , it means the number is multiplied by 2^i.

        /*
            - " >> " : Right Shift Binary Operator.
            - It shifts the bits towards right n times.
            - Mathematically, it means the number is divided by 2^i.
        */
        /*int n = 1;
        for(int i = 1; i <= 32; i++){
            n = n << 1;
            System.out.println(n);
        }*/

        /*
            - " >>> " : Unsigned Right Shift Operator
            - Similar to Right Shift Operator , but always fills with 0.
        */

        // 1. Check Even or Odd
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        // 2. Check Power of 2
        if ((n & (n-1)) == 0)
            System.out.println("Power of 2");
        else
            System.out.println("Not Power of 2");

        // 3. Swap Numbers using XOR
        int a = 5;
        int b = 6;
        System.out.println("a: " + a + ", b: "+ b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b; 
        System.out.println("a: " + a + ", b: "+ b);
        
        // 4. Find unique element (all others appear twice)
        // Exor all the numbers , finally remaining number will be unique elements.

        // n : Binary format
        // ~n : 2's Complement format

        // to remove last set bit use : [n & (~n)]
    }
}
